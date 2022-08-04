package com.pctechworld.desktop_system_portal.repositories;




import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;



import com.pctechworld.desktop_system_portal.Entities.Pccart;

public interface PccartRepository extends JpaRepository<Pccart,String>  {

    @Transactional
    public String deleteByProductId(String productId);


    

    

 

    

    
    
}
