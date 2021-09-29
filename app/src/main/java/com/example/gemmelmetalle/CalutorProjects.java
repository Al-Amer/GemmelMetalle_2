package com.example.gemmelmetalle;

public class CalutorProjects {

    //Vareiables
    int first_masuer;
    int secand_masuer;
    int threeth_masuer;
    int fourth_mauser;
    int fiveth_masuer;
    int sixth_masuer;
    int depp_matreial;
    String project_type;
    int first_side_inside;
    int secand_side_inside;
    int three_side_inside;
    int fourth_side_inside;
    int fiveth_side_inside;
    int sixth_side_inside;
    int all_inside;
    int all_outside;
    int l1_inside;
    int l1_outside;
    int l2_inside;
    int l2_outside;
    int l3_inside;
    int l3_outside;
    int l4_inside;
    int l4_outside;



    //Destrukor
    public CalutorProjects(int l1,int l2,int l3,int l4,int l5,int dm,String type){
        this.first_masuer=l1;
        this.secand_masuer=l2;
        this.threeth_masuer=l3;
        this.fourth_mauser=l4;
        this.fiveth_masuer=l5;
        this.depp_matreial=dm;
        this.project_type=type;

    }
    public CalutorProjects(int l1,int l2,int l3,int l4,int dm,String type){
        this.first_masuer=l1;
        this.secand_masuer=l2;
        this.threeth_masuer=l3;
        this.fourth_mauser=l4;
        this.depp_matreial=dm;
        this.project_type=type;

    }
    public CalutorProjects(int l1,int l2,int l3,int dm,String type){
        this.first_masuer=l1;
        this.secand_masuer=l2;
        this.threeth_masuer=l3;
        this.depp_matreial=dm;
        this.project_type=type;

    }
    public CalutorProjects(int l1,int l2,int dm,String type){
        this.first_masuer=l1;
        this.secand_masuer=l2;
        this.depp_matreial=dm;
        this.project_type=type;

    }
    public CalutorProjects(int l1,int l2,int l3,int l4,int l5,int l6,int dm,String type){
        this.first_masuer=l1;
        this.secand_masuer=l2;
        this.threeth_masuer=l3;
        this.fourth_mauser=l4;
        this.fiveth_masuer=l5;
        this.sixth_masuer=l6;
        this.depp_matreial=dm;
        this.project_type=type;
    }

   public   String  project_result (){
       String result ;
        if (project_type.equalsIgnoreCase("ALLGEMEINE KANALSCHACHTABDECKUNG")){
            first_side_inside=first_masuer-depp_matreial;
            secand_side_inside=secand_masuer-depp_matreial;
            three_side_inside=threeth_masuer-(depp_matreial*2);
            fourth_side_inside=fourth_mauser-depp_matreial;
            fiveth_side_inside=fiveth_masuer-depp_matreial;
            all_inside=first_side_inside+secand_side_inside+three_side_inside+fourth_side_inside+fiveth_side_inside;
            all_outside=first_masuer+secand_masuer+threeth_masuer+fourth_mauser+fiveth_masuer;


                result="L1 inside ="+first_side_inside+" and L1 outside ="+first_side_inside+"\n" +
                    "H1 inside ="+secand_side_inside+" and H1 outside ="+secand_masuer+"\n" +
                "L2 inside ="+three_side_inside+" and L2 outside ="+threeth_masuer+"\n" +
                "H2 inside ="+fourth_side_inside+" and H2 outside ="+fourth_mauser+"\n" +
                "L3 inside ="+fiveth_side_inside+" and L3 outside ="+fiveth_masuer+"\n" +
                        "All inside mauser="+all_inside+" and all outside masuer ="+all_outside;


           // return result;

        }else if (project_type.equalsIgnoreCase("FENTERBANK/TROPFBLECHE")){
            first_side_inside=first_masuer-depp_matreial;
            secand_side_inside=secand_masuer-depp_matreial;
            three_side_inside=threeth_masuer-(depp_matreial *2);
            fourth_side_inside=fourth_mauser-depp_matreial;
            all_inside=first_side_inside+secand_side_inside+three_side_inside+fourth_side_inside;
            all_outside=first_masuer+secand_masuer+threeth_masuer+fourth_mauser;

            result="L1 inside ="+first_side_inside+" and L1 outside ="+first_side_inside+"\n" +
                    "H1 inside ="+secand_side_inside+" and H1 outside ="+secand_masuer+"\n" +
                    "L2 inside ="+three_side_inside+" and L2 outside ="+threeth_masuer+"\n" +
                    "H2 inside ="+fourth_side_inside+" and H2 outside ="+fourth_mauser+"\n" +
                    "All inside mauser="+all_inside+" and all outside masuer ="+all_outside;

           // return result;
        }else if (project_type.equalsIgnoreCase("HUT-PROFIL")){
            first_side_inside=first_masuer-depp_matreial;
            secand_side_inside=secand_masuer-depp_matreial;
            three_side_inside=threeth_masuer-(depp_matreial*2);
            fourth_side_inside=fourth_mauser-depp_matreial;
            fiveth_side_inside=fiveth_masuer-depp_matreial;
            all_inside=first_side_inside+secand_side_inside+three_side_inside+fourth_side_inside+fiveth_side_inside;
            all_outside=first_masuer+secand_masuer+threeth_masuer+fourth_mauser+fiveth_masuer;


            result="L1 inside ="+first_side_inside+" and L1 outside ="+first_side_inside+"\n" +
                    "H1 inside ="+secand_side_inside+" and H1 outside ="+secand_masuer+"\n" +
                    "L2 inside ="+three_side_inside+" and L2 outside ="+threeth_masuer+"\n" +
                    "H2 inside ="+fourth_side_inside+" and H2 outside ="+fourth_mauser+"\n" +
                    "L3 inside ="+fiveth_side_inside+" and L3 outside ="+fiveth_masuer+"\n" +
                    "All inside mauser="+all_inside+" and all outside masuer ="+all_outside;

           // return result;
        }else if (project_type.equalsIgnoreCase("MAUERWERKABDECKUNG")){
            first_side_inside=first_masuer-depp_matreial;
            secand_side_inside=secand_masuer-(depp_matreial*2);
            three_side_inside=threeth_masuer-(depp_matreial*2);
            fourth_side_inside=fourth_mauser-(depp_matreial*2);
            fiveth_side_inside=fiveth_masuer-depp_matreial;
            all_inside=first_side_inside+secand_side_inside+three_side_inside+fourth_side_inside+fiveth_side_inside;
            all_outside=first_masuer+secand_masuer+threeth_masuer+fourth_mauser+fiveth_masuer;


            result="L1 inside ="+first_side_inside+" and L1 outside ="+first_side_inside+"\n" +
                    "H1 inside ="+secand_side_inside+" and H1 outside ="+secand_masuer+"\n" +
                    "L2 inside ="+three_side_inside+" and L2 outside ="+threeth_masuer+"\n" +
                    "H2 inside ="+fourth_side_inside+" and H2 outside ="+fourth_mauser+"\n" +
                    "L3 inside ="+fiveth_side_inside+" and L3 outside ="+fiveth_masuer+"\n" +
                    "All inside mauser="+all_inside+" and all outside masuer ="+all_outside;

           // return result;
        }else if(project_type.equalsIgnoreCase("SEITENABDECKUNG")){
            first_side_inside=first_masuer-depp_matreial;
            secand_side_inside=secand_masuer-depp_matreial;
            three_side_inside=threeth_masuer- depp_matreial;
            fourth_side_inside=fourth_mauser-depp_matreial;
            all_inside=first_side_inside+secand_side_inside+three_side_inside+fourth_side_inside;
            all_outside=first_masuer+secand_masuer+threeth_masuer+fourth_mauser;

            result="H1 inside ="+first_side_inside+" and H1 outside ="+first_side_inside+"\n" +
                    "L1 inside ="+secand_side_inside+" and L1 outside ="+secand_masuer+"\n" +
                    "H2 inside ="+three_side_inside+" and H2 outside ="+threeth_masuer+"\n" +
                    "L2 inside ="+fourth_side_inside+" and L2 outside ="+fourth_mauser+"\n" +
                    "All inside mauser="+all_inside+" and all outside masuer ="+all_outside;

           // return result;
        }else if(project_type.equalsIgnoreCase("U-PROFIL")){
            first_side_inside=first_masuer-depp_matreial;
            secand_side_inside=secand_masuer-(depp_matreial *2);
            three_side_inside=threeth_masuer- depp_matreial ;
            fourth_side_inside=fourth_mauser-depp_matreial;
            all_inside=first_side_inside+secand_side_inside+three_side_inside+fourth_side_inside;
            all_outside=first_masuer+secand_masuer+threeth_masuer+fourth_mauser;

            result="H1 inside ="+first_side_inside+" and H1 outside ="+first_side_inside+"\n" +
                    "L1 inside ="+secand_side_inside+" and L1 outside ="+secand_masuer+"\n" +
                    "H2 inside ="+three_side_inside+" and H2 outside ="+threeth_masuer+"\n" +
                    "L2 inside ="+fourth_side_inside+" and L2 outside ="+fourth_mauser+"\n" +
                    "All inside mauser="+all_inside+" and all outside masuer ="+all_outside;

            //return result;
        }else if(project_type.equalsIgnoreCase("U-PROFIL / C-PROFIL")){
            first_side_inside=first_masuer-depp_matreial;
            secand_side_inside=secand_masuer-(depp_matreial *2);
            three_side_inside=threeth_masuer- depp_matreial ;
            all_inside=first_side_inside+secand_side_inside+three_side_inside+fourth_side_inside;
            all_outside=first_masuer+secand_masuer+threeth_masuer+fourth_mauser;

            result="H1 inside ="+first_side_inside+" and H1 outside ="+first_side_inside+"\n" +
                    "L1 inside ="+secand_side_inside+" and L1 outside ="+secand_masuer+"\n" +
                    "H2 inside ="+three_side_inside+" and H2 outside ="+threeth_masuer+"\n" +
                    "All inside mauser="+all_inside+" and all outside masuer ="+all_outside;

           // return result;
        }else if(project_type.equalsIgnoreCase("WINKEL")){
            first_side_inside=first_masuer-depp_matreial;
            secand_side_inside=secand_masuer-depp_matreial;

            all_inside=first_side_inside+secand_side_inside+three_side_inside+fourth_side_inside;
            all_outside=first_masuer+secand_masuer+threeth_masuer+fourth_mauser;

            result="H1 inside ="+first_side_inside+" and H1 outside ="+first_side_inside+"\n" +
                    "L1 inside ="+secand_side_inside+" and L1 outside ="+secand_masuer+"\n" +
                    "All inside mauser="+all_inside+" and all outside masuer ="+all_outside;

           // return result;
        }else if(project_type.equalsIgnoreCase("Z-PROFIL")){
            first_side_inside=first_masuer-depp_matreial;
            secand_side_inside=secand_masuer-depp_matreial;
            three_side_inside=threeth_masuer-depp_matreial;

            all_inside=first_side_inside+secand_side_inside+three_side_inside+fourth_side_inside;
            all_outside=first_masuer+secand_masuer+threeth_masuer+fourth_mauser;

            result="H1 inside ="+first_side_inside+" and H1 outside ="+first_side_inside+"\n" +
                    "L1 inside ="+secand_side_inside+" and L1 outside ="+secand_masuer+"\n" +
                    "H2 inside ="+three_side_inside+" and H2 outside ="+threeth_masuer+"\n"+
                    "All inside mauser="+all_inside+" and all outside masuer ="+all_outside;
            
           // return result;
        }else if (project_type.equalsIgnoreCase("WANNE")){
            first_side_inside=first_masuer-depp_matreial;
            secand_side_inside=secand_masuer-(depp_matreial *2);
            three_side_inside=threeth_masuer-depp_matreial;
            fourth_side_inside=fourth_mauser-depp_matreial;
            fiveth_side_inside=fiveth_masuer-(depp_matreial * 2);
            sixth_side_inside=sixth_masuer-depp_matreial;
            l1_outside=first_masuer+secand_masuer+threeth_masuer;
            l2_outside= fourth_mauser+fiveth_masuer+sixth_masuer;
            l3_inside=  secand_side_inside;
            l3_outside= secand_masuer;
            l4_inside= fiveth_side_inside;
            l4_outside = first_masuer;
            result="L1 = "+l1_outside+" And L2 ="+l2_outside+"\n"+
            "L3 inside = "+l3_inside+" And L3 outside ="+l3_outside+"\n"+
            "L4 inside = "+l4_inside+" And L4 outside ="+l4_outside ;
        }else if (project_type.equalsIgnoreCase("WANNE 2/2N")){
            first_side_inside=first_masuer-depp_matreial;
            secand_side_inside=secand_masuer-depp_matreial ;
            three_side_inside=threeth_masuer-depp_matreial;
            fourth_side_inside=fourth_mauser-depp_matreial;
            fiveth_side_inside=fiveth_masuer-depp_matreial ;
            sixth_side_inside=sixth_masuer-depp_matreial;
            l1_outside=first_masuer+secand_masuer+threeth_masuer;
           // l1_inside=first_side_inside+secand_side_inside+three_side_inside;
            l2_outside= fourth_mauser+fiveth_masuer+sixth_masuer;
           // l2_inside=first_side_inside+fiveth_side_inside+sixth_side_inside;
            l3_inside=  secand_side_inside;
            l3_outside= secand_masuer;
            l4_inside= fiveth_side_inside;
            l4_outside = first_masuer;
            result="L1  = "+l1_outside+" And L2 ="+l2_outside+"\n"+
                    "L3 inside = "+l3_inside+" And L3 outside ="+l3_outside+"\n"+
                    "L4 inside = "+l4_inside+" And L4 outside ="+l4_outside ;
        }else if (project_type.equalsIgnoreCase("WANNE 2/2G")){
            first_side_inside=first_masuer-depp_matreial;
            secand_side_inside=secand_masuer-(depp_matreial *2);
            three_side_inside=threeth_masuer-depp_matreial;
            fourth_side_inside=fourth_mauser-depp_matreial;
            fiveth_side_inside=fiveth_masuer-(depp_matreial * 2);
            sixth_side_inside=sixth_masuer-depp_matreial;
            l1_outside=first_masuer+secand_masuer+threeth_masuer;
            l2_outside= fourth_mauser+fiveth_masuer+sixth_masuer;
            l3_inside=  secand_side_inside;
            l3_outside= secand_masuer;
            l4_inside= fiveth_side_inside;
            l4_outside = first_masuer;
            result="L1 = "+l1_outside+" And L2 ="+l2_outside+"\n"+
                    "L3 inside = "+l3_inside+" And L3 outside ="+l3_outside+"\n"+
                    "L4 inside = "+l4_inside+" And L4 outside ="+l4_outside ;
        }else if (project_type.equalsIgnoreCase("WANNE 3/1")){
            first_side_inside=first_masuer-depp_matreial;
            secand_side_inside=secand_masuer-depp_matreial ;
            three_side_inside=threeth_masuer-depp_matreial;
            fourth_side_inside=fourth_mauser-depp_matreial;
            fiveth_side_inside=fiveth_masuer-depp_matreial ;
            sixth_side_inside=sixth_masuer-depp_matreial;
            l1_outside=first_masuer+secand_masuer+threeth_masuer;
            l2_outside= fourth_mauser+fiveth_masuer+sixth_masuer;
            l3_inside=  secand_side_inside;
            l3_outside= secand_masuer;
            l4_inside= fiveth_side_inside;
            l4_outside = first_masuer;
            result="L1  = "+l1_outside+" And L2 ="+l2_outside+"\n"+
                    "L3 inside = "+l3_inside+" And L3 outside ="+l3_outside+"\n"+
                    "L4 inside = "+l4_inside+" And L4 outside ="+l4_outside ;
        } else if (project_type.equalsIgnoreCase("WANNE 3-SEITIG")){
            first_side_inside=first_masuer-depp_matreial;
            secand_side_inside=secand_masuer-depp_matreial ;
            three_side_inside=threeth_masuer-depp_matreial;
            fourth_side_inside=fourth_mauser-depp_matreial;
            fiveth_side_inside=fiveth_masuer-depp_matreial ;
            l1_outside=first_masuer+secand_masuer+threeth_masuer;
            l2_outside= fourth_mauser+fiveth_masuer;
            l3_inside=  secand_side_inside;
            l3_outside= secand_masuer;
            l4_inside= fourth_side_inside;
            l4_outside = fourth_mauser;
            result="L1  = "+l1_outside+" And L2 ="+l2_outside+"\n"+
                    "L3 inside = "+l3_inside+" And L3 outside ="+l3_outside+"\n"+
                    "L4 inside = "+l4_inside+" And L4 outside ="+l4_outside ;
        }else {
                result=" ";
        }
       return result;
    }




}
