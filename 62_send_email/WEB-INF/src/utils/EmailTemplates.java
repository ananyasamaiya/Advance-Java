package utils;

public class EmailTemplates {
    public static String getWelcomeMail(){
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
                        "            Lorem ipsum dolor, sit amet consectetur adipisicing elit. Numquam iure eaque adipisci eligendi ratione quisquam exercitationem veniam nostrum doloremque amet voluptate cupiditate recusandae veritatis dolore obcaecati repellendus, molestiae tempora aperiam?\r\n" + //
                        "            Fuga saepe nulla repellendus maxime. Sint nesciunt facere quos consectetur perspiciatis earum cumque, vel magni a enim cum reiciendis commodi fugit expedita vitae nihil eligendi. Voluptate nobis fugit amet officia.\r\n" + //
                        "            Impedit ratione officia facilis at, neque corrupti voluptate rem tenetur voluptates maiores, nihil perferendis laboriosam quasi! Laudantium porro veniam minima pariatur assumenda natus, perferendis eaque commodi voluptatum rerum, repellat voluptatem!\r\n" + //
                        "            Quis dolorum quasi porro tempore molestiae eum atque mollitia sit ipsa recusandae? Possimus repellendus est nobis iste voluptate, dolorum asperiores quidem fugit numquam adipisci animi quisquam voluptatem? Incidunt, dolorum iste!\r\n" + //
                        "            Non, necessitatibus cumque eaque culpa iusto ullam cum commodi quas, quos corrupti dolorem neque modi optio deleniti placeat quia sed saepe vel maxime! Ea, tempore quia! Voluptatum ex voluptates harum!\r\n" + //
                        "            Voluptatum commodi ut recusandae fugiat, blanditiis minus ab ex earum cupiditate, id aut porro facere numquam, facilis nisi unde sunt voluptas voluptatibus impedit. Iure inventore eum illum veniam quas vero?\r\n" + //
                        "            Sunt odio, vitae esse ipsa illo impedit nobis, repellendus aliquam non, corporis tempore beatae asperiores deleniti dignissimos? Saepe quas doloremque quam fuga quia voluptas impedit, excepturi, iste sequi voluptates nam.\r\n" + //
                        "            Dolore, totam dolorem fuga quaerat recusandae omnis? Id voluptas culpa accusantium quis consequuntur reiciendis, natus amet incidunt nisi molestias voluptatem, veniam voluptates, quos repudiandae. Obcaecati commodi possimus soluta sint accusamus.\r\n" + //
                        "            Sit illo consequuntur fugiat ut expedita. Iusto nisi placeat porro nostrum? Culpa explicabo temporibus eius nostrum at dolorum provident, quaerat placeat, inventore facilis deserunt, quas aut corrupti tempore similique laborum!\r\n" + //
                        "            Accusamus labore fuga distinctio rerum, a ut non architecto laboriosam, ullam veritatis dicta quod nemo voluptate ex pariatur reprehenderit, amet consequuntur vitae? Blanditiis ad rem sit necessitatibus numquam! Cupiditate, ducimus.\r\n" + //
                        "            Quam incidunt quae, porro quia iste maxime culpa temporibus est excepturi animi enim alias. At similique iste voluptatum minima necessitatibus illum quos fugit, temporibus perspiciatis illo, sit laborum. Quos, magnam?\r\n" + //
                        "            Minus cupiditate maxime natus? Facere quia ut, odio veniam voluptatibus quisquam sed laborum doloribus aliquid possimus repellat! Atque eaque odio asperiores quaerat eum accusamus deleniti sit, tenetur soluta culpa consequatur.\r\n" + //
                        "            Tenetur iusto, in voluptate hic inventore eius necessitatibus? Aspernatur natus fugit porro excepturi vitae ipsa deleniti blanditiis magnam aut hic, aliquid reprehenderit necessitatibus dolorum obcaecati magni optio architecto. Facilis, itaque?\r\n" + //
                        "            Quas at, corrupti officia blanditiis totam consequatur mollitia eligendi ut aspernatur asperiores maxime facere laborum veritatis nam alias. Laborum fuga dolore natus est, voluptatibus necessitatibus aliquam assumenda unde quibusdam pariatur?\r\n" + //
                        "            Recusandae quasi suscipit, totam aperiam voluptatum ullam, blanditiis amet distinctio dolorum expedita incidunt? Atque laborum unde pariatur minus odio fuga voluptates similique dolore eos obcaecati. Veritatis eaque magni architecto quas.\r\n" + //
                        "            Aut, vel, praesentium sed voluptatem error, id eligendi hic consequuntur delectus ullam deleniti! Iste mollitia quod sed maxime ullam facilis quibusdam itaque aut rem dignissimos soluta, optio recusandae autem rerum.\r\n" + //
                        "            Ipsa voluptates, dolorum possimus esse fugiat animi eligendi quia perferendis rem sunt amet provident rerum corrupti consequuntur aspernatur sequi reiciendis, explicabo, vero porro. Ipsam eos omnis laboriosam, illo dolores doloremque.\r\n" + //
                        "            Eius dolor earum quis ipsum asperiores nulla eligendi, ad error, et necessitatibus aspernatur esse blanditiis! Fuga, consequatur dolores eveniet deserunt incidunt vitae veritatis reprehenderit quod optio esse voluptas magnam sit?\r\n" + //
                        "            Saepe repudiandae quisquam aliquid, dignissimos suscipit, animi officiis blanditiis eveniet qui in, quod nihil officia? Ipsam debitis ducimus quibusdam porro dolorem temporibus explicabo consequatur dolorum omnis dolor id, vero laborum?\r\n" + //
                        "            Maxime, possimus aperiam. Amet sed eius hic quam consequatur dignissimos iusto voluptate fugit porro illo sunt distinctio laborum quia earum beatae ipsa, minima voluptatibus quod magni. Cupiditate sunt fugiat ullam!\r\n" + //
                        "            Provident, at explicabo eos numquam illum ducimus tenetur atque totam laboriosam consequatur expedita deserunt id iure velit cumque beatae sed perspiciatis ipsum aspernatur doloremque, delectus harum. Consequuntur aliquam voluptatum non!\r\n" + //
                        "            Saepe molestiae sint autem eaque, necessitatibus reiciendis porro in aperiam. At maiores culpa, ut officiis corrupti doloribus accusamus repellendus! Quas dolore fugiat nemo dolor a inventore fuga quia adipisci nobis.\r\n" + //
                        "            Unde itaque voluptate amet, pariatur numquam ea dignissimos possimus, ratione ipsa sequi fuga praesentium omnis recusandae? Nulla qui eveniet pariatur labore, cumque excepturi architecto aperiam est, quaerat cum, dolorum ratione.\r\n" + //
                        "            Sunt repudiandae quos aspernatur, quaerat quam mollitia voluptate vel soluta cupiditate, enim incidunt similique repellendus debitis ullam laudantium aut suscipit molestiae. Vel qui voluptatem distinctio similique iste, ratione saepe error?\r\n" + //
                        "            Minus, fugiat? Similique, exercitationem. Delectus eveniet laboriosam eum fugiat possimus aut voluptatum, ab dolor, est hic recusandae nam labore incidunt officiis suscipit odit tenetur atque quasi, numquam perferendis fugit placeat!\r\n" + //
                        "            Dolore nihil modi at maxime debitis repellendus ipsum, reprehenderit voluptate voluptatem explicabo quos exercitationem rerum a excepturi odio. Inventore modi placeat ratione? Magnam earum eveniet facere omnis minus, numquam eum!\r\n" + //
                        "            Magni repudiandae quis voluptate eveniet a odio! Iste esse rem, quam modi fugiat recusandae doloribus a optio nesciunt labore minima voluptate voluptates eaque tempore inventore? Itaque nihil aut modi repudiandae!\r\n" + //
                        "            Earum laborum nihil velit recusandae, quibusdam voluptate debitis in, eum, magnam dolore dicta aspernatur nostrum eos eius eligendi aperiam cupiditate corrupti. Cupiditate harum odit laudantium tempore pariatur, sapiente consequatur nobis.\r\n" + //
                        "            Veniam, unde cumque. At reiciendis voluptatum placeat magni laudantium esse adipisci et quos blanditiis modi vitae error officiis, aperiam, sapiente culpa sequi quasi. Vel sunt, ducimus mollitia aliquam molestias recusandae.\r\n" + //
                        "            Asperiores quis voluptatem cupiditate nulla cum, distinctio mollitia quae tempore porro magni iusto rerum repellat. Harum aliquam porro voluptates, beatae nam alias quo dolorum doloribus ullam similique quos reprehenderit dolor!\r\n" + //
                        "        </p>\r\n" + //
                        "        </div>\r\n" + //
                        "        <div id=\"footer\">\r\n" + //
                        "            &copy; ISRDC since 7456 AD\r\n" + //
                        "        </div>\r\n" + //
                        "    </div>\r\n" + //
                        "</body>\r\n" + //
                        "</html>";
    }
}