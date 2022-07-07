package ezen.dev.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ezen.dev.spring.dao.AdminDao;
import ezen.dev.spring.dao.GalleryDao;
import ezen.dev.spring.vo.GalleryVo;
import ezen.dev.spring.vo.MemberVo;

@Service
public class GalleryService {
	
	private GalleryDao galleryDao;
	
	@Autowired
	public GalleryService(GalleryDao galleryDao) {
		this.galleryDao = galleryDao;
	}
	

	public int addGallery(GalleryVo galleryVo) {
		return galleryDao.addGallery(galleryVo);
	}


	public List<GalleryVo> getGalleryList() {
		return galleryDao.getGalleryList();
	}

}
