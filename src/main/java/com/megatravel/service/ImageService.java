package com.megatravel.service;

import com.megatravel.model.Image;
import com.megatravel.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {

    @Autowired
    private ImageRepository accomodationRepository;

    public Image findById(Long  id){
        return accomodationRepository.findById(id).get();
    }

    public List<Image> findAll(){
        return accomodationRepository.findAll();
    }

    public Image save(Image user){
        return accomodationRepository.save(user);
    }

    public void remove(Long id){accomodationRepository.deleteById(id);}
}
