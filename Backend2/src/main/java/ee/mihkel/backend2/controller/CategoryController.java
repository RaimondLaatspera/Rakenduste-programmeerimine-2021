package ee.mihkel.backend2.controller;
import ee.mihkel.backend2.model.Category;
import ee.mihkel.backend2.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class CategoryController {

    @Autowired
    CategoryService categoryService;


    @GetMapping("categories")
    public List<Category> getCategories() {
        return categoryService.getCategories();
    }

    @PostMapping("categories")
    public String postCategory(@RequestBody Category category) {
        categoryService.saveCategory(category);
        return "Category added successfully " + category.getCategory();
    }
}