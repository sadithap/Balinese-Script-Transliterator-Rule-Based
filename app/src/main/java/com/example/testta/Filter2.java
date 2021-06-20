package com.example.testta;

public class Filter2 {

    public String transliterasi(String text){

        String f3=text;
        text = f3
                .replace("1B331B44","h") //ha
                .replace("1B331B3E","he")
                .replace("1B331B35","hā")
                .replace("1B331B38","hu")
                .replace("1B331B36","hi")
                .replace("1B331B3F","hai")
                .replace("1B331B02","hang")
                .replace("1B331B42","hě")
                .replace("1B331B03","har")
                .replace("1B331B3A","hrě")
                .replace("1B331B04","hah")
                .replace("1B331B3C","hlě")
                .replace("1B331B40","ho")
                .replace("1B331B37","hī")
                .replace("1B331B39","hū")
                .replace("1B331B41","hau")
                .replace("1B331B43","hö")
                .replace("1B331B3B","hrö")
                .replace("1B331B3D","hlö")
                .replace("1B331B01","hang")
                .replace("1B331B00","ham")
                .replace("1B261B44","n") //na
                .replace("1B261B3E","ne")
                .replace("1B261B35","nā")
                .replace("1B261B38","nu")
                .replace("1B261B36","ni")
                .replace("1B261B3F","nai")
                .replace("1B261B02","nang")
                .replace("1B261B42","ně")
                .replace("1B261B03","nar")
                .replace("1B261B3A","nrě")
                .replace("1B261B04","nah")
                .replace("1B261B3C","nlě")
                .replace("1B261B40","no")
                .replace("1B261B37","nī")
                .replace("1B261B39","nū")
                .replace("1B261B41","nau")
                .replace("1B261B43","nö")
                .replace("1B261B3B","nrö")
                .replace("1B261B3D","nlö")
                .replace("1B261B01","nang")
                .replace("1B261B00","nam")
                .replace("1B181B44","c") //ca
                .replace("1B181B3E","ce")
                .replace("1B181B35","cā")
                .replace("1B181B38","cu")
                .replace("1B181B36","ci")
                .replace("1B181B3F","cai")
                .replace("1B181B02","cang")
                .replace("1B181B42","cě")
                .replace("1B181B03","car")
                .replace("1B181B3A","crě")
                .replace("1B181B04","cah")
                .replace("1B181B3C","clě")
                .replace("1B181B40","co")
                .replace("1B181B37","cī")
                .replace("1B181B39","cū")
                .replace("1B181B41","cau")
                .replace("1B181B43","cö")
                .replace("1B181B3B","crö")
                .replace("1B181B3D","clö")
                .replace("1B181B01","cang")
                .replace("1B181B00","cam")
                .replace("1B2D1B44","r") //ra
                .replace("1B2D1B3E","re")
                .replace("1B2D1B35","rā")
                .replace("1B2D1B38","ru")
                .replace("1B2D1B36","ri")
                .replace("1B2D1B3F","rai")
                .replace("1B2D1B02","rang")
                .replace("1B2D1B42","rě")
                .replace("1B2D1B03","rar")
                .replace("1B2D1B3A","rrě")
                .replace("1B2D1B04","rah")
                .replace("1B2D1B3C","rlě")
                .replace("1B2D1B40","ro")
                .replace("1B2D1B37","rī")
                .replace("1B2D1B39","rū")
                .replace("1B2D1B41","rau")
                .replace("1B2D1B43","rö")
                .replace("1B2D1B3B","rrö")
                .replace("1B2D1B3D","rlö")
                .replace("1B2D1B01","rang")
                .replace("1B2D1B00","ram")
                .replace("1B131B44","k") //ka
                .replace("1B131B3E","ke")
                .replace("1B131B35","kā")
                .replace("1B131B38","ku")
                .replace("1B131B36","ki")
                .replace("1B131B3F","kai")
                .replace("1B131B02","kang")
                .replace("1B131B42","kě")
                .replace("1B131B03","kar")
                .replace("1B131B3A","krě")
                .replace("1B131B04","kah")
                .replace("1B131B3C","klě")
                .replace("1B131B40","ko")
                .replace("1B131B37","kī")
                .replace("1B131B39","kū")
                .replace("1B131B41","kau")
                .replace("1B131B43","kö")
                .replace("1B131B3B","krö")
                .replace("1B131B3D","klö")
                .replace("1B131B01","kang")
                .replace("1B131B00","kam")
                .replace("1B241B44","d") //da
                .replace("1B241B3E","de")
                .replace("1B241B35","dā")
                .replace("1B241B38","du")
                .replace("1B241B36","di")
                .replace("1B241B3F","dai")
                .replace("1B241B02","dang")
                .replace("1B241B42","dě")
                .replace("1B241B03","dar")
                .replace("1B241B3A","drě")
                .replace("1B241B04","dah")
                .replace("1B241B3C","dlě")
                .replace("1B241B40","do")
                .replace("1B241B37","dī")
                .replace("1B241B39","dū")
                .replace("1B241B41","dau")
                .replace("1B241B43","dö")
                .replace("1B241B3B","drö")
                .replace("1B241B3D","dlö")
                .replace("1B241B01","dang")
                .replace("1B241B00","dam")
                .replace("1B221B44","t") //ta
                .replace("1B221B3E","te")
                .replace("1B221B35","tā")
                .replace("1B221B38","tu")
                .replace("1B221B36","ti")
                .replace("1B221B3F","tai")
                .replace("1B221B02","tang")
                .replace("1B221B42","tě")
                .replace("1B221B03","tar")
                .replace("1B221B3A","trě")
                .replace("1B221B04","tah")
                .replace("1B221B3C","tlě")
                .replace("1B221B40","to")
                .replace("1B221B37","tī")
                .replace("1B221B39","tū")
                .replace("1B221B41","tau")
                .replace("1B221B43","tö")
                .replace("1B221B3B","trö")
                .replace("1B221B3D","tlö")
                .replace("1B221B01","tang")
                .replace("1B221B00","tam")
                .replace("1B321B44","s") //sa
                .replace("1B321B3E","se")
                .replace("1B321B35","sā")
                .replace("1B321B38","su")
                .replace("1B321B36","si")
                .replace("1B321B3F","sai")
                .replace("1B321B02","sang")
                .replace("1B321B42","sě")
                .replace("1B321B03","sar")
                .replace("1B321B3A","srě")
                .replace("1B321B04","sah")
                .replace("1B321B3C","slě")
                .replace("1B321B40","so")
                .replace("1B321B37","sī")
                .replace("1B321B39","sū")
                .replace("1B321B41","sau")
                .replace("1B321B43","sö")
                .replace("1B321B3B","srö")
                .replace("1B321B3D","slö")
                .replace("1B321B01","sang")
                .replace("1B321B00","sam")
                .replace("1B2F1B44","w") //wa
                .replace("1B2F1B3E","we")
                .replace("1B2F1B35","wā")
                .replace("1B2F1B38","wu")
                .replace("1B2F1B36","wi")
                .replace("1B2F1B3F","wai")
                .replace("1B2F1B02","wang")
                .replace("1B2F1B42","wě")
                .replace("1B2F1B03","war")
                .replace("1B2F1B3A","wrě")
                .replace("1B2F1B04","wah")
                .replace("1B2F1B3C","wlě")
                .replace("1B2F1B40","wo")
                .replace("1B2F1B37","wī")
                .replace("1B2F1B39","wū")
                .replace("1B2F1B41","wau")
                .replace("1B2F1B43","wö")
                .replace("1B2F1B3B","wrö")
                .replace("1B2F1B3D","wlö")
                .replace("1B2F1B01","wang")
                .replace("1B2F1B00","wam")
                .replace("1B2E1B44","l") //la
                .replace("1B2E1B3E","le")
                .replace("1B2E1B35","lā")
                .replace("1B2E1B38","lu")
                .replace("1B2E1B36","li")
                .replace("1B2E1B3F","lai")
                .replace("1B2E1B02","lang")
                .replace("1B2E1B42","lě")
                .replace("1B2E1B03","lar")
                .replace("1B2E1B3A","lrě")
                .replace("1B2E1B04","lah")
                .replace("1B2E1B3C","llě")
                .replace("1B2E1B40","lo")
                .replace("1B2E1B37","lī")
                .replace("1B2E1B39","lū")
                .replace("1B2E1B41","lau")
                .replace("1B2E1B43","lö")
                .replace("1B2E1B3B","lrö")
                .replace("1B2E1B3D","llö")
                .replace("1B2E1B01","lang")
                .replace("1B2E1B00","lam")
                .replace("1B2B1B44","m") //ma
                .replace("1B2B1B3E","me")
                .replace("1B2B1B35","mā")
                .replace("1B2B1B38","mu")
                .replace("1B2B1B36","mi")
                .replace("1B2B1B3F","mai")
                .replace("1B2B1B02","mang")
                .replace("1B2B1B42","mě")
                .replace("1B2B1B03","mar")
                .replace("1B2B1B3A","mrě")
                .replace("1B2B1B04","mah")
                .replace("1B2B1B3C","mlě")
                .replace("1B2B1B40","mo")
                .replace("1B2B1B37","mī")
                .replace("1B2B1B39","mū")
                .replace("1B2B1B41","mau")
                .replace("1B2B1B43","mö")
                .replace("1B2B1B3B","mrö")
                .replace("1B2B1B3D","mlö")
                .replace("1B2B1B01","mang")
                .replace("1B2B1B00","mam")
                .replace("1B151B44","g") //ga
                .replace("1B151B3E","ge")
                .replace("1B151B35","gā")
                .replace("1B151B38","gu")
                .replace("1B151B36","gi")
                .replace("1B151B3F","gai")
                .replace("1B151B02","gang")
                .replace("1B151B42","gě")
                .replace("1B151B03","gar")
                .replace("1B151B3A","grě")
                .replace("1B151B04","gah")
                .replace("1B151B3C","glě")
                .replace("1B151B40","go")
                .replace("1B151B37","gī")
                .replace("1B151B39","gū")
                .replace("1B151B41","gau")
                .replace("1B151B43","gö")
                .replace("1B151B3B","grö")
                .replace("1B151B3D","glö")
                .replace("1B151B01","gang")
                .replace("1B151B00","gam")
                .replace("1B291B44","b") //ba
                .replace("1B291B3E","be")
                .replace("1B291B35","bā")
                .replace("1B291B38","bu")
                .replace("1B291B36","bi")
                .replace("1B291B3F","bai")
                .replace("1B291B02","bang")
                .replace("1B291B42","bě")
                .replace("1B291B03","bar")
                .replace("1B291B3A","brě")
                .replace("1B291B04","bah")
                .replace("1B291B3C","blě")
                .replace("1B291B40","bo")
                .replace("1B291B37","bī")
                .replace("1B291B39","bū")
                .replace("1B291B41","bau")
                .replace("1B291B43","bö")
                .replace("1B291B3B","brö")
                .replace("1B291B3D","blö")
                .replace("1B291B01","bang")
                .replace("1B291B00","bam")
                .replace("1B171B44","ng") //nga
                .replace("1B171B3E","nge")
                .replace("1B171B35","ngā")
                .replace("1B171B38","ngu")
                .replace("1B171B36","ngi")
                .replace("1B171B3F","ngai")
                .replace("1B171B02","ngang")
                .replace("1B171B42","ngě")
                .replace("1B171B03","ngar")
                .replace("1B171B3A","ngrě")
                .replace("1B171B04","ngah")
                .replace("1B171B3C","nglě")
                .replace("1B171B40","ngo")
                .replace("1B171B37","ngī")
                .replace("1B171B39","ngū")
                .replace("1B171B41","ngau")
                .replace("1B171B43","ngö")
                .replace("1B171B3B","ngrö")
                .replace("1B171B3D","nglö")
                .replace("1B171B01","ngang")
                .replace("1B171B00","ngam")
                .replace("1B271B44","p") //pa
                .replace("1B271B3E","pe")
                .replace("1B271B35","pā")
                .replace("1B271B38","pu")
                .replace("1B271B36","pi")
                .replace("1B271B3F","pai")
                .replace("1B271B02","pang")
                .replace("1B271B42","pě")
                .replace("1B271B03","par")
                .replace("1B271B3A","prě")
                .replace("1B271B04","pah")
                .replace("1B271B3C","plě")
                .replace("1B271B40","po")
                .replace("1B271B37","pī")
                .replace("1B271B39","pū")
                .replace("1B271B41","pau")
                .replace("1B271B43","pö")
                .replace("1B271B3B","prö")
                .replace("1B271B3D","plö")
                .replace("1B271B01","pang")
                .replace("1B271B00","pam")
                .replace("1B1A1B44","j") //ja
                .replace("1B1A1B3E","je")
                .replace("1B1A1B35","jā")
                .replace("1B1A1B38","ju")
                .replace("1B1A1B36","ji")
                .replace("1B1A1B3F","jai")
                .replace("1B1A1B02","jang")
                .replace("1B1A1B42","jě")
                .replace("1B1A1B03","jar")
                .replace("1B1A1B3A","jrě")
                .replace("1B1A1B04","jah")
                .replace("1B1A1B3C","jlě")
                .replace("1B1A1B40","jo")
                .replace("1B1A1B37","jī")
                .replace("1B1A1B39","jū")
                .replace("1B1A1B41","jau")
                .replace("1B1A1B43","jö")
                .replace("1B1A1B3B","jrö")
                .replace("1B1A1B3D","jlö")
                .replace("1B1A1B01","jang")
                .replace("1B1A1B00","jam")
                .replace("1B2C1B44","y") //ya
                .replace("1B2C1B3E","ye")
                .replace("1B2C1B35","yā")
                .replace("1B2C1B38","yu")
                .replace("1B2C1B36","yi")
                .replace("1B2C1B3F","yai")
                .replace("1B2C1B02","yang")
                .replace("1B2C1B42","yě")
                .replace("1B2C1B03","yar")
                .replace("1B2C1B3A","yrě")
                .replace("1B2C1B04","yah")
                .replace("1B2C1B3C","ylě")
                .replace("1B2C1B40","yo")
                .replace("1B2C1B37","yī")
                .replace("1B2C1B39","yū")
                .replace("1B2C1B41","yau")
                .replace("1B2C1B43","yö")
                .replace("1B2C1B3B","yrö")
                .replace("1B2C1B3D","ylö")
                .replace("1B2C1B01","yang")
                .replace("1B2C1B00","yam")
                .replace("1B1C1B44","ny") //nya
                .replace("1B1C1B3E","nye")
                .replace("1B1C1B35","nyā")
                .replace("1B1C1B38","nyu")
                .replace("1B1C1B36","nyi")
                .replace("1B1C1B3F","nyai")
                .replace("1B1C1B02","nyang")
                .replace("1B1C1B42","nyě")
                .replace("1B1C1B03","nyar")
                .replace("1B1C1B3A","nyrě")
                .replace("1B1C1B04","nyah")
                .replace("1B1C1B3C","nylě")
                .replace("1B1C1B40","nyo")
                .replace("1B1C1B37","nyī")
                .replace("1B1C1B39","nyū")
                .replace("1B1C1B41","nyau")
                .replace("1B1C1B43","nyö")
                .replace("1B1C1B3B","nyrö")
                .replace("1B1C1B3D","nylö")
                .replace("1B1C1B01","nyang")
                .replace("1B1C1B00","nyam")
                .replace("1B211B44","ņ") //ņa
                .replace("1B211B3E","ņe")
                .replace("1B211B35","ņā")
                .replace("1B211B38","ņu")
                .replace("1B211B36","ņi")
                .replace("1B211B3F","ņai")
                .replace("1B211B02","ņang")
                .replace("1B211B42","ņě")
                .replace("1B211B03","ņar")
                .replace("1B211B3A","ņrě")
                .replace("1B211B04","ņah")
                .replace("1B211B3C","ņlě")
                .replace("1B211B40","ņo")
                .replace("1B211B37","ņī")
                .replace("1B211B39","ņū")
                .replace("1B211B41","ņau")
                .replace("1B211B43","ņö")
                .replace("1B211B3B","ņrö")
                .replace("1B211B3D","ņlö")
                .replace("1B211B01","ņang")
                .replace("1B211B00","ņam")
                .replace("1B191B44","ch") //cha
                .replace("1B191B3E","che")
                .replace("1B191B35","chā")
                .replace("1B191B38","chu")
                .replace("1B191B36","chi")
                .replace("1B191B3F","chai")
                .replace("1B191B02","chang")
                .replace("1B191B42","chě")
                .replace("1B191B03","char")
                .replace("1B191B3A","chrě")
                .replace("1B191B04","chah")
                .replace("1B191B3C","chlě")
                .replace("1B191B40","cho")
                .replace("1B191B37","chī")
                .replace("1B191B39","chū")
                .replace("1B191B41","chau")
                .replace("1B191B43","chö")
                .replace("1B191B3B","chrö")
                .replace("1B191B3D","chlö")
                .replace("1B191B01","chang")
                .replace("1B191B00","cham")
                .replace("1B141B44","kh") //kha
                .replace("1B141B3E","khe")
                .replace("1B141B35","khā")
                .replace("1B141B38","khu")
                .replace("1B141B36","khi")
                .replace("1B141B3F","khai")
                .replace("1B141B02","khang")
                .replace("1B141B42","khě")
                .replace("1B141B03","khar")
                .replace("1B141B3A","khrě")
                .replace("1B141B04","khah")
                .replace("1B141B3C","khlě")
                .replace("1B141B40","kho")
                .replace("1B141B37","khī")
                .replace("1B141B39","khū")
                .replace("1B141B41","khau")
                .replace("1B141B43","khö")
                .replace("1B141B3B","khrö")
                .replace("1B141B3D","khlö")
                .replace("1B141B01","khang")
                .replace("1B141B00","kham")
                .replace("1B251B44","dh") //dha
                .replace("1B251B3E","dhe")
                .replace("1B251B35","dhā")
                .replace("1B251B38","dhu")
                .replace("1B251B36","dhi")
                .replace("1B251B3F","dhai")
                .replace("1B251B02","dhang")
                .replace("1B251B42","dhě")
                .replace("1B251B03","dhar")
                .replace("1B251B3A","dhrě")
                .replace("1B251B04","dhah")
                .replace("1B251B3C","dhlě")
                .replace("1B251B40","dho")
                .replace("1B251B37","dhī")
                .replace("1B251B39","dhū")
                .replace("1B251B41","dhau")
                .replace("1B251B43","dhö")
                .replace("1B251B3B","dhrö")
                .replace("1B251B3D","dhlö")
                .replace("1B251B01","dhang")
                .replace("1B251B00","dham")
                .replace("1B1F1B44","ḍ") //ḍa
                .replace("1B1F1B3E","ḍe")
                .replace("1B1F1B35","ḍā")
                .replace("1B1F1B38","ḍu")
                .replace("1B1F1B36","ḍi")
                .replace("1B1F1B3F","ḍai")
                .replace("1B1F1B02","ḍang")
                .replace("1B1F1B42","ḍě")
                .replace("1B1F1B03","ḍar")
                .replace("1B1F1B3A","ḍrě")
                .replace("1B1F1B04","ḍah")
                .replace("1B1F1B3C","ḍlě")
                .replace("1B1F1B40","ḍo")
                .replace("1B1F1B37","ḍī")
                .replace("1B1F1B39","ḍū")
                .replace("1B1F1B41","ḍau")
                .replace("1B1F1B43","ḍö")
                .replace("1B1F1B3B","ḍrö")
                .replace("1B1F1B3D","ḍlö")
                .replace("1B1F1B01","ḍang")
                .replace("1B1F1B00","ḍam")
                .replace("1B201B44","ḍh") //ḍha
                .replace("1B201B3E","ḍhe")
                .replace("1B201B35","ḍhā")
                .replace("1B201B38","ḍhu")
                .replace("1B201B36","ḍhi")
                .replace("1B201B3F","ḍhai")
                .replace("1B201B02","ḍhang")
                .replace("1B201B42","ḍhě")
                .replace("1B201B03","ḍhar")
                .replace("1B201B3A","ḍhrě")
                .replace("1B201B04","ḍhah")
                .replace("1B201B3C","ḍhlě")
                .replace("1B201B40","ḍho")
                .replace("1B201B37","ḍhī")
                .replace("1B201B39","ḍhū")
                .replace("1B201B41","ḍhau")
                .replace("1B201B43","ḍhö")
                .replace("1B201B3B","ḍhrö")
                .replace("1B201B3D","ḍhlö")
                .replace("1B201B01","ḍhang")
                .replace("1B201B00","ḍham")
                .replace("1B231B44","th") //tha
                .replace("1B231B3E","the")
                .replace("1B231B35","thā")
                .replace("1B231B38","thu")
                .replace("1B231B36","thi")
                .replace("1B231B3F","thai")
                .replace("1B231B02","thang")
                .replace("1B231B42","thě")
                .replace("1B231B03","thar")
                .replace("1B231B3A","thrě")
                .replace("1B231B04","thah")
                .replace("1B231B3C","thlě")
                .replace("1B231B40","tho")
                .replace("1B231B37","thī")
                .replace("1B231B39","thū")
                .replace("1B231B41","thau")
                .replace("1B231B43","thö")
                .replace("1B231B3B","thrö")
                .replace("1B231B3D","thlö")
                .replace("1B231B01","thang")
                .replace("1B231B00","tham")
                .replace("1B1D1B44","ţ") //ţa
                .replace("1B1D1B3E","ţe")
                .replace("1B1D1B35","ţā")
                .replace("1B1D1B38","ţu")
                .replace("1B1D1B36","ţi")
                .replace("1B1D1B3F","ţai")
                .replace("1B1D1B02","ţang")
                .replace("1B1D1B42","ţě")
                .replace("1B1D1B03","ţar")
                .replace("1B1D1B3A","ţrě")
                .replace("1B1D1B04","ţah")
                .replace("1B1D1B3C","ţlě")
                .replace("1B1D1B40","ţo")
                .replace("1B1D1B37","ţī")
                .replace("1B1D1B39","ţū")
                .replace("1B1D1B41","ţau")
                .replace("1B1D1B43","ţö")
                .replace("1B1D1B3B","ţrö")
                .replace("1B1D1B3D","ţlö")
                .replace("1B1D1B01","ţang")
                .replace("1B1D1B00","ţam")
                .replace("1B1E1B44","ţh") //ţha
                .replace("1B1E1B3E","ţhe")
                .replace("1B1E1B35","ţhā")
                .replace("1B1E1B38","ţhu")
                .replace("1B1E1B36","ţhi")
                .replace("1B1E1B3F","ţhai")
                .replace("1B1E1B02","ţhang")
                .replace("1B1E1B42","ţhě")
                .replace("1B1E1B03","ţhar")
                .replace("1B1E1B3A","ţhrě")
                .replace("1B1E1B04","ţhah")
                .replace("1B1E1B3C","ţhlě")
                .replace("1B1E1B40","ţho")
                .replace("1B1E1B37","ţhī")
                .replace("1B1E1B39","ţhū")
                .replace("1B1E1B41","ţhau")
                .replace("1B1E1B43","ţhö")
                .replace("1B1E1B3B","ţhrö")
                .replace("1B1E1B3D","ţhlö")
                .replace("1B1E1B01","ţhang")
                .replace("1B1E1B00","ţham")
                .replace("1B301B44","ş") //şa
                .replace("1B301B3E","şe")
                .replace("1B301B35","şā")
                .replace("1B301B38","şu")
                .replace("1B301B36","şi")
                .replace("1B301B3F","şai")
                .replace("1B301B02","şang")
                .replace("1B301B42","şě")
                .replace("1B301B03","şar")
                .replace("1B301B3A","şrě")
                .replace("1B301B04","şah")
                .replace("1B301B3C","şlě")
                .replace("1B301B40","şo")
                .replace("1B301B37","şī")
                .replace("1B301B39","şū")
                .replace("1B301B41","şau")
                .replace("1B301B43","şö")
                .replace("1B301B3B","şrö")
                .replace("1B301B3D","şlö")
                .replace("1B301B01","şang")
                .replace("1B301B00","şam")
                .replace("1B311B44","ś") //śa
                .replace("1B311B3E","śe")
                .replace("1B311B35","śā")
                .replace("1B311B38","śu")
                .replace("1B311B36","śi")
                .replace("1B311B3F","śai")
                .replace("1B311B02","śang")
                .replace("1B311B42","śě")
                .replace("1B311B03","śar")
                .replace("1B311B3A","śrě")
                .replace("1B311B04","śah")
                .replace("1B311B3C","ślě")
                .replace("1B311B40","śo")
                .replace("1B311B37","śī")
                .replace("1B311B39","śū")
                .replace("1B311B41","śau")
                .replace("1B311B43","śö")
                .replace("1B311B3B","śrö")
                .replace("1B311B3D","ślö")
                .replace("1B311B01","śang")
                .replace("1B311B00","śam")
                .replace("1B161B44","gh") //gha
                .replace("1B161B3E","ghe")
                .replace("1B161B35","ghā")
                .replace("1B161B38","ghu")
                .replace("1B161B36","ghi")
                .replace("1B161B3F","ghai")
                .replace("1B161B02","ghang")
                .replace("1B161B42","ghě")
                .replace("1B161B03","ghar")
                .replace("1B161B3A","ghrě")
                .replace("1B161B04","ghah")
                .replace("1B161B3C","ghlě")
                .replace("1B161B40","gho")
                .replace("1B161B37","ghī")
                .replace("1B161B39","ghū")
                .replace("1B161B41","ghau")
                .replace("1B161B43","ghö")
                .replace("1B161B3B","ghrö")
                .replace("1B161B3D","ghlö")
                .replace("1B161B01","ghang")
                .replace("1B161B00","gham")
                .replace("1B2A1B44","bh") //bha
                .replace("1B2A1B3E","bhe")
                .replace("1B2A1B35","bhā")
                .replace("1B2A1B38","bhu")
                .replace("1B2A1B36","bhi")
                .replace("1B2A1B3F","bhai")
                .replace("1B2A1B02","bhang")
                .replace("1B2A1B42","bhě")
                .replace("1B2A1B03","bhar")
                .replace("1B2A1B3A","bhrě")
                .replace("1B2A1B04","bhah")
                .replace("1B2A1B3C","bhlě")
                .replace("1B2A1B40","bho")
                .replace("1B2A1B37","bhī")
                .replace("1B2A1B39","bhū")
                .replace("1B2A1B41","bhau")
                .replace("1B2A1B43","bhö")
                .replace("1B2A1B3B","bhrö")
                .replace("1B2A1B3D","bhlö")
                .replace("1B2A1B01","bhang")
                .replace("1B2A1B00","bham")
                .replace("1B281B44","ph") //pha
                .replace("1B281B3E","phe")
                .replace("1B281B35","phā")
                .replace("1B281B38","phu")
                .replace("1B281B36","phi")
                .replace("1B281B3F","phai")
                .replace("1B281B02","phang")
                .replace("1B281B42","phě")
                .replace("1B281B03","phar")
                .replace("1B281B3A","phrě")
                .replace("1B281B04","phah")
                .replace("1B281B3C","phlě")
                .replace("1B281B40","pho")
                .replace("1B281B37","phī")
                .replace("1B281B39","phū")
                .replace("1B281B41","phau")
                .replace("1B281B43","phö")
                .replace("1B281B3B","phrö")
                .replace("1B281B3D","phlö")
                .replace("1B281B01","phang")
                .replace("1B281B00","pham")
                .replace("1B1B1B44","jh") //jha
                .replace("1B1B1B3E","jhe")
                .replace("1B1B1B35","jhā")
                .replace("1B1B1B38","jhu")
                .replace("1B1B1B36","jhi")
                .replace("1B1B1B3F","jhai")
                .replace("1B1B1B02","jhang")
                .replace("1B1B1B42","jhě")
                .replace("1B1B1B03","jhar")
                .replace("1B1B1B3A","jhrě")
                .replace("1B1B1B04","jhah")
                .replace("1B1B1B3C","jhlě")
                .replace("1B1B1B40","jho")
                .replace("1B1B1B37","jhī")
                .replace("1B1B1B39","jhū")
                .replace("1B1B1B41","jhau")
                .replace("1B1B1B43","jhö")
                .replace("1B1B1B3B","jhrö")
                .replace("1B1B1B3D","jhlö")
                .replace("1B1B1B01","jhang")
                .replace("1B1B1B00","jham")
                .replace("1B111B01","ong") //extra
                .replace("1B121B01","OM")
                .replace("1B101B01","aing")
                .replace("1B0B1B44","r")
                .replace("1B0B1B3E","re")
                .replace("1B0B1B35","rā")
                .replace("1B0B1B38","ru")
                .replace("1B0B1B36","ri")
                .replace("1B0B1B3F","rěi")
                .replace("1B0B1B02","rěng")
                .replace("1B0B1B42","rě")
                .replace("1B0B1B03","rěr")
                .replace("1B0B1B3A","rrě")
                .replace("1B0B1B04","rěh")
                .replace("1B0B1B3C","rlě")
                .replace("1B0B1B40","ro")
                .replace("1B0B1B37","rī")
                .replace("1B0B1B39","rū")
                .replace("1B0B1B41","rěu")
                .replace("1B0B1B43","rö")
                .replace("1B0B1B3B","rrö")
                .replace("1B0B1B3D","rlö")
                .replace("1B0B1B01","rěng")
                .replace("1B0B1B00","rěm")
                .replace("1B0C1B44","r")
                .replace("1B0C1B3E","re")
                .replace("1B0C1B35","rā")
                .replace("1B0C1B38","ru")
                .replace("1B0C1B36","ri")
                .replace("1B0C1B3F","röi")
                .replace("1B0C1B02","röng")
                .replace("1B0C1B42","rě")
                .replace("1B0C1B03","rör")
                .replace("1B0C1B3A","rrě")
                .replace("1B0C1B04","röh")
                .replace("1B0C1B3C","rlě")
                .replace("1B0C1B40","ro")
                .replace("1B0C1B37","rī")
                .replace("1B0C1B39","rū")
                .replace("1B0C1B41","röu")
                .replace("1B0C1B43","rö")
                .replace("1B0C1B3B","rrö")
                .replace("1B0C1B3D","rlö")
                .replace("1B0C1B01","röng")
                .replace("1B0C1B00","röm")
                .replace("1B0D1B44","l")
                .replace("1B0D1B3E","le")
                .replace("1B0D1B35","lā")
                .replace("1B0D1B38","lu")
                .replace("1B0D1B36","li")
                .replace("1B0D1B3F","lěi")
                .replace("1B0D1B02","lěng")
                .replace("1B0D1B42","lě")
                .replace("1B0D1B03","lěr")
                .replace("1B0D1B3A","lrě")
                .replace("1B0D1B04","lěh")
                .replace("1B0D1B3C","llě")
                .replace("1B0D1B40","lo")
                .replace("1B0D1B37","lī")
                .replace("1B0D1B39","lū")
                .replace("1B0D1B41","lěu")
                .replace("1B0D1B43","lö")
                .replace("1B0D1B3B","lrö")
                .replace("1B0D1B3D","llö")
                .replace("1B0D1B01","lěng")
                .replace("1B0D1B00","lěm")
                .replace("1B0E1B44","l")
                .replace("1B0E1B3E","le")
                .replace("1B0E1B35","lā")
                .replace("1B0E1B38","lu")
                .replace("1B0E1B36","li")
                .replace("1B0E1B3F","löi")
                .replace("1B0E1B02","löng")
                .replace("1B0E1B42","lě")
                .replace("1B0E1B03","lör")
                .replace("1B0E1B3A","lrě")
                .replace("1B0E1B04","löh")
                .replace("1B0E1B3C","llě")
                .replace("1B0E1B40","lo")
                .replace("1B0E1B37","lī")
                .replace("1B0E1B39","lū")
                .replace("1B0E1B41","löu")
                .replace("1B0E1B43","lö")
                .replace("1B0E1B3B","lrö")
                .replace("1B0E1B3D","llö")
                .replace("1B0E1B01","löng")
                .replace("1B0E1B00","löm");


        return text;
    }

    public Filter2(){

    }
}