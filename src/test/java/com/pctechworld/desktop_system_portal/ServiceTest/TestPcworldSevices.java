// package com.pctechworld.desktop_system_portal.ServiceTest;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.mockito.Mockito.times;
// import static org.mockito.Mockito.verify;
// import static org.mockito.Mockito.when;

// import java.util.LinkedList;
// import java.util.List;
// import java.util.Optional;

// import org.assertj.core.api.Assertions;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.junit.jupiter.MockitoExtension;

// import com.pctechworld.desktop_system_portal.Entities.CATAGORIES;
// import com.pctechworld.desktop_system_portal.Entities.Pcworld;
// import com.pctechworld.desktop_system_portal.Entities.STATUS;
// import com.pctechworld.desktop_system_portal.repositories.PcworldRepository;
// import com.pctechworld.desktop_system_portal.services.PcworldImpl;

// @ExtendWith(MockitoExtension.class)
// public class TestPcworldSevices {
//     @InjectMocks
//     private PcworldImpl srvObj;
//     @Mock
//     private PcworldRepository repoObj;

//     /**
//      * 
//      */
//     @Test
//     public void fetchAllByProducts(){
//         List<Pcworld> list = new LinkedList<Pcworld>();
//          Pcworld prOne = new Pcworld("A101", "rrt", "RTX 3060", 36000.0f, "RTX3060Ti", STATUS.INACTIVE, CATAGORIES.GPU);
//          Pcworld prTwo = new Pcworld("A102", "rrt", "RTX 3060", 32000.0f, "RTX3060", STATUS.ACTIVE, CATAGORIES.GPU);
//          Pcworld prThree = new Pcworld("A103", "rrt", "RTX 4060", 40000.0f, "RTX4060Ti", STATUS.ACTIVE, CATAGORIES.GPU);

//          list.add(prOne);
//          list.add(prTwo);
//          list.add(prThree);

//          when(repoObj.findAll()).thenReturn(list);

//          List<Pcworld> prlist=srvObj.fetchAllByProducts();

//          assertEquals(3, prlist.size());
//          verify(repoObj, times(1)).findAll();
//     }           
    
//     @Test
//     public void fetchAllByproductId(){
      
//         Pcworld p1 = new Pcworld("A102", "rrt", "RTX 3060", 32000.0f, "RTX3060", STATUS.ACTIVE, CATAGORIES.GPU);
       
//         when(repoObj.findById("A102")).thenReturn(java.util.Optional.of(p1));

//         Optional<Pcworld> pr=srvObj.fetchAllByproductId(p1);
//         assertEquals(STATUS.ACTIVE,pr.get().getProductStatus());
//         assertEquals(p1.getProductId(),pr.get().getProductId());
    
//        }
    
//        @Test
//        public void addIdByProductId(){
//         Pcworld a1= new Pcworld("A102", "rrt", "RTX 3060", 32000.0f, "RTX3060", STATUS.ACTIVE, CATAGORIES.GPU);
        

//         when(repoObj.save(a1)).thenReturn(a1);
//         String a2 = srvObj.addIdByProductId(a1);
//         assertNotNull(a2);

//        }

//        @Test
//        public void updateByProductId(){
//         List<Pcworld> list = new LinkedList<Pcworld>();
//         Pcworld p1 = new Pcworld("A102", "rrt", "RTX 3060", 32000.0f, "RTX3060", STATUS.ACTIVE, CATAGORIES.GPU);
//         list.add(p1);
//        when(repoObj.findById("A102").get()).thenReturn(p1);
       
//         p1.setProductName("RTX4046");

//         Pcworld updatedvalue = srvObj.updateByProductId(p1);
//         Assertions.assertThat(updatedvalue.getProductName()).isEqualTo(p1);

//        }
// }
