package utils;

public class EmailTemplates {
    public static String getWelcomeMail(String name, String email, String verificationCode){
        return "<!DOCTYPE html>\r\n" + //
                        "<html lang=\"en\">\r\n" + //
                        "<head>\r\n" + //
                        "    <meta charset=\"UTF-8\">\r\n" + //
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                        "    <title>Document</title>\r\n" + //
                        "    <style>\r\n" + //
                        "        body{\r\n" + //
                        "            margin: 0px auto;\r\n" + //
                        "            font-family: Verdana;\r\n" + //
                        "        }\r\n" + //
                        "        #container{\r\n" + //
                        "            width: 90%;\r\n" + //
                        "            margin: 0px auto;\r\n" + //
                        "        }\r\n" + //
                        "        #header{\r\n" + //
                        "            border: 1px solid #ccc;\r\n" + //
                        "            border-radius: 9px;\r\n" + //
                        "            padding: 5px;\r\n" + //
                        "            margin-bottom: 10px;\r\n" + //
                        "        }\r\n" + //
                        "        #menu{\r\n" + //
                        "            border: 1px solid #ccc;\r\n" + //
                        "            border-radius: 9px;\r\n" + //
                        "            padding: 5px;\r\n" + //
                        "            margin-bottom: 10px;\r\n" + //
                        "        }\r\n" + //
                        "        #main_body{\r\n" + //
                        "            border: 1px solid #ccc;\r\n" + //
                        "            border-radius: 9px;\r\n" + //
                        "            padding: 5px;\r\n" + //
                        "            margin-bottom: 10px;\r\n" + //
                        "        }\r\n" + //
                        "        #footer{\r\n" + //
                        "            border: 1px solid #ccc;\r\n" + //
                        "            border-radius: 9px;\r\n" + //
                        "            padding: 5px;\r\n" + //
                        "            margin-bottom: 10px;\r\n" + //
                        "        }\r\n" + //
                        "        #text{\r\n" + //
                        "            border: 1px solid #ccc;\r\n" + //
                        "            padding: 10px;\r\n" + //
                        "            border-radius: 9px;\r\n" + //
                        "            width: 90%;\r\n" + //
                        "            margin: 20px auto;\r\n" + //
                        "        }\r\n" + //
                        "        li{\r\n" + //
                        "            list-style: none;\r\n" + //
                        "            display: inline;\r\n" + //
                        "            margin-right: 10px;\r\n" + //
                        "        }\r\n" + //
                        "        li a{\r\n" + //
                        "            text-decoration: none;\r\n" + //
                        "            border: 1px solid #eee;\r\n" + //
                        "            padding: 5px 12px;\r\n" + //
                        "            font-family: Verdana;\r\n" + //
                        "        }\r\n" + //
                        "        #logo_text{\r\n" + //
                        "            display: inline-block;\r\n" + //
                        "        }\r\n" + //
                        "    </style>\r\n" + //
                        "</head>\r\n" + //
                        "<body>\r\n" + //
                        "    <div id=\"container\">\r\n" + //
                        "        <div id=\"header\">\r\n" + //
                        "            <img height=\"60\" src=\"https://img.freepik.com/premium-vector/free-vector-beautiful-flying-hummingbird-design-element-banners-posters-leaflets-brochur_1009653-1.jpg?semt=ais_hybrid&w=740&q=80\" alt=\"\">\r\n" + //
                        "            <h1 id=\"logo_text\">ISRDC</h1>\r\n" + //
                        "        </div>\r\n" + //
                        "        <div id=\"menu\">\r\n" + //
                        "            <ul>\r\n" + //
                        "                <li><a href=\"\">Home</a></li>\r\n" + //
                        "                <li><a href=\"\">Products</a></li>\r\n" + //
                        "                <li><a href=\"\">Services</a></li>\r\n" + //
                        "                <li><a href=\"\">Contact us</a></li>\r\n" + //
                        "            </ul>\r\n" + //
                        "        </div>\r\n" + //
                        "        <div id=\"main_body\">\r\n" + //
                        "            <p id=\"text\">\r\n" + //
                        "            Welcome " + name + ",  \r\n" + //
                        "            Click over the <a href='http://localhost:8080/63_mini_app/verify_acc.do?email=" + email +"&verification_code=" + verificationCode + "'> verification link </a> to verify your email and activate your account  \r\n" + //
                        "            Regards  \r\n" + //
                        "            ISRDC  \r\n" + //
                        " </p>\r\n" + //
                        "        </div>\r\n" + //
                        "        <div id=\"footer\">\r\n" + //
                        "            &copy; ISRDC since 7456 AD\r\n" + //
                        "        </div>\r\n" + //
                        "    </div>\r\n" + //
                        "</body>\r\n" + //
                        "</html>";
    }
}