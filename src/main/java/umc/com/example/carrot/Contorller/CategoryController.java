package umc.com.example.carrot.Contorller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.com.example.carrot.entity.Category;
import umc.com.example.carrot.service.CategoryService;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/category/{id}")
    public Category read(@PathVariable Long id) {return categoryService.findById(id);}

    @PostMapping("/category")
    public Long create(@RequestBody Category category) {return categoryService.save(category);}

    @PostMapping("/category/update")
    public Long update(@PathVariable Long id, @RequestBody Category category) {return categoryService.update(id,category); }

    @PostMapping("/category/delete")
    public Long delete(@PathVariable Long id){
        categoryService.delete(id);
        return id;
    }
}
