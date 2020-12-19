package com.server.tradedoc.logic.api.admin;

import com.server.tradedoc.logic.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class ImageAdminAPI {

    @Autowired
    private ImageService imageService;

    @RequestMapping(value = "/create-image" , method = RequestMethod.POST)
    public ResponseEntity<?> createImage(@RequestParam("image") MultipartFile image) throws URISyntaxException {
        return ResponseEntity.ok(imageService.createImage(image));
    }
}