package umc.com.example.carrot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.com.example.carrot.entity.Category;
import umc.com.example.carrot.repository.CateRepository;

import javax.transaction.Transactional;


@Service
@RequiredArgsConstructor
public class CategoryService {

    public final CateRepository cateRepository;

    public Category findById(Long id){
        return cateRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("존재하지 않는 카테고리 입니다."));
    }

    @Transactional
    public Long save(Category category) {
        return cateRepository.save(category).getId();
    }
    @Transactional
    public Long update(Long id,Category category){
        Category currentCategory=findById(id);
        currentCategory.update(category.getName());
        return id;
    }
    @Transactional
    public void delete(Long id){
        Category category=findById(id);
        cateRepository.delete(category);
    }
}
