package com.example.demo.controller;



import com.example.demo.entity.Agency;
import com.example.demo.entity.Vehicule;
import com.example.demo.service.AgencyService;
import com.example.demo.service.UserService;
import com.example.demo.service.VehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import  com.example.demo.entity.Employee;


@RestController
@RequestMapping("api/employ")
@AllArgsConstructor
public class EmployController {
    private final UserService service;
    private final AgencyService service2;


    @PostMapping
    @ResponseBody
    public String addEmployee(@RequestBody Employee e1) {

        if (service.save(e1) == null) {
            if (service2.update(e1) != null) {
                return "Updated";}
            else if (service2.update(e1) == null) {

            }

            return " not Saved";}


         else {


            return "Saved";
        }
    }
    @GetMapping
    @ResponseBody
    public Iterable<Employee> getAllEmployee() {

        return null;//service.findAll();
    }
    }




















    /*@GetMapping
      public String Sayhello(){
       return "wassim";
      }

      @GetMapping("{name}")
     public String Sayhello(@PathVariable String name){
         return name;
     }

     /*@GetMapping("/query")
     public String Sayhelloquery(@RequestParam String name){
         return name;
     }*/



   /* @SneakyThrows
    @PostMapping
    @ResponseBody
    public Object save(@RequestBody List<Vehicule> foms)  {


        File file = new File("C:\\Uploads\\nouveau_fichier.txt");
        System.out.println(file.createNewFile());
        PrintWriter writer = new PrintWriter(file, StandardCharsets.UTF_8);


            int count=1;

           for (int i =0 ; i <=2  ; i++){
               count --;

               for (int j =2; j>=0 ; j--){

                   if (i==j)
                   {
                       continue;
                   }
                   if (!Objects.equals(foms.get(i).getModele(), foms.get(j).getModele())){
                       while (count==0){
                       writer.println(String.format(" Model %s : %s",foms.get(i).getID(),foms.get(i).getModele()));

                   count ++;}
                  }
                   else {
                       while (count==0  ){

                       writer.println(String.format("Model %s %s  Double : %s %s",foms.get(i).getID(),foms.get(j).getID(),foms.get(i).getModele(),foms.get(j).getModele()));
                          count ++;}

                   }
               }
           }
        //});
        writer.close();
        return foms;
    }*/

    /*@PostMapping
    @ResponseBody
    public Vehicule get(@RequestBody Vehicule fom){
       if (fom.getAge()>18 && fom.getAge()<82){
           return fom;
       } else  {
           return  "Votre age ne correspond pas a l'age requis";

       }

        return fom;
        }*/










