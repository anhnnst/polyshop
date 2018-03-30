package edu.poly.shop.controller;

import edu.poly.shop.domain.Category;
import edu.poly.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Controller class for Category domain
 * Author: Nguyen Ngoc Anh - anhnnst@yahoo.com
 * Date: 30/3/2018
 */

@Controller
@RequestMapping(value = "/category")
public class CategoryController {
    private static final String ADMINISTRATOR_CATEGORIES = "administrator/categories/";

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addGet(ModelMap modelMap){
        modelMap.addAttribute("page_title","Add New Category");
        modelMap.addAttribute("category", new Category());
        return ADMINISTRATOR_CATEGORIES + "addOrEdit";
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String addEdit(ModelMap modelMap, @PathVariable(value = "id") String id){
        modelMap.addAttribute("page_title","Edit Category");
        try{
            if (id != null){
                Long idL = Long.parseLong(id);

                Optional<Category> categoryOptional = categoryService.findById(idL);

                modelMap.addAttribute("category", categoryOptional.get());

                return ADMINISTRATOR_CATEGORIES + "addOrEdit";
            }
        }catch (Exception ex){
            modelMap.addAttribute("error", ex.getMessage());
        }

        modelMap.addAttribute("category", new Category());
        return ADMINISTRATOR_CATEGORIES + "addOrEdit";
    }

    @RequestMapping(value = "/addOrEdit", method = RequestMethod.POST)
    public String addOrEditPost(ModelMap modelMap,
                                @ModelAttribute(value = "category") @Validated Category category,
                                BindingResult bindingResult
    ){

        if (bindingResult.hasErrors()){
            return ADMINISTRATOR_CATEGORIES + "addOrEdit";
        }

        try {
            category.setProductList(new ArrayList<>());
            categoryService.save(category);

            return "redirect:/category/list";
        }catch (Exception ex){
            ex.printStackTrace();
            modelMap.addAttribute("error", ex.getMessage());
        }

        return ADMINISTRATOR_CATEGORIES + "addOrEdit";
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(ModelMap modelMap){
        List<Category> categoryList = (List<Category>) categoryService.findAll();

        modelMap.addAttribute("page_title","List All Categories");
        modelMap.addAttribute("list", categoryList);

        return ADMINISTRATOR_CATEGORIES + "list";
    }
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String list(ModelMap modelMap, @PathParam(value = "name") String name){
        modelMap.addAttribute("page_title", "List All Categories");
        List<Category> categoryList = null;
        if (name != null && !name.equals("")) {
            categoryList = (List<Category>) categoryService.findCategoriesByNameContaining(name);
        }else{
            categoryList = (List<Category>) categoryService.findAll();
        }
        modelMap.addAttribute("list", categoryList);
        return ADMINISTRATOR_CATEGORIES + "search";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(ModelMap modelMap, @PathVariable(value = "id") String  id){
        modelMap.addAttribute("page_title","List All Categories");
        try {
            if (id != null){
                Long idL = Long.parseLong(id);

                categoryService.deleteById(idL);
                modelMap.addAttribute("message","Category has been deleted!");
            }else{
                modelMap.addAttribute("error","Category Id must be provided!");
            }

            List<Category> categoryList = (List<Category>) categoryService.findAll();

            modelMap.addAttribute("list", categoryList);
        }catch (Exception ex){
            modelMap.addAttribute("error", ex.getMessage());
        }

        return ADMINISTRATOR_CATEGORIES + "search";
    }
}
