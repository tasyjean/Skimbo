package viadeo

object ViadeoFixture {

  def miniTimeline = """
  {
    "data":[{
    "id":"vtpdaEiowDurIvlcEmydfDjnkO",
    "type":"NEWS ITEM",
    "name":"",
    "link":"",
    "from":{
      "id":"dOxiOrwyedisgxtrcAldmxuOms",
      "type":"USER",
      "name":"Jean-Jacques FULGONI",
      "link":"http://www.viadeo.com/profile/0022afiuthzvo2z2","updated_time":"2012-11-12T22:26:48+0100"
    },
    "on":{
      "id":"iVioxnsrfIsrzhkEqqxfissiyc",
      "type":"GROUP MESSAGE",
      "name":"",
      "link":"http://www.viadeo.com/hub/forums/detaildiscussion/?containerId=00228flt2cyau3d&action=messageDetail&messageId=0029w43cwdejq8i&forumId=0021gtrpl7nvf036",
      "author":{
        "id":"dOxiOrwyedisgxtrcAldmxuOms",
        "type":"USER",
        "name":"Jean-Jacques FULGONI",
        "link":"http://www.viadeo.com/profile/0022afiuthzvo2z2","updated_time":"2012-11-12T22:26:48+0100"
      },
      "title":"Création d'une place de marché informatique gratuite",
      "forum":{
        "id":"djbODrwmtDVnbkoqyqbqsmqDrk",
        "type":"GROUP FORUM",
        "name":"Offres business",
        "link":"","updated_time":"2012-11-17T15:56:16+0100"
      },
      "message":"Bonjour  ECI Conseils vous annonce la création d'une place de marché informatique gratuite  - Pour trouver des compétences disponibles immédiatement  Déjà...",
      "updated_time":"2012-11-16T22:41:49+0100",
      "hub_category":{
        "id":"basbpnoExIzaxdoEkfcvhDaxiA",
        "name":"Informatique - Internet - Télécom - Multimedia - Divers"
      },
      "view_count":1,
      "comment_count":0,
      "like_count":0
    },
    "category":{
      "id":"fkEvfminebzdejraDzDOmwbves",
      "type":"NEWS CATEGORY",
      "name":"Forum messages",
      "link":"",
      "updated_time":"2012-11-17T15:56:16+0100"
    },
    "label":"a posté un nouveau message : ",
    "message":"Création d'une place de marché informatique gratuite",
    "language":"fr",
    "updated_time":"2012-11-16T22:41:49+0100",
    "infeed_link":"http://www.viadeo.com/hub/forums/affichepost/?postId=0029w43cwdejq8i",
    "creation_date":"2012-11-16T22:41:49+0100",
    "comment_count":0,
    "like_count":0,
    "tags":["consultant","création","formateur","freelances","indépendants","informatique","place de marché","secteur it","ssi","une"]}
  ]}
    """
    
  def timelineNewJob =
    """
  {"data":[
    {"id":"AbrqpsAogfuAOzijAbfxxqwyAk",
    "type":"NEWS ITEM",
    "name":"",
    "link":"",
    "from":{
      "id":"ikitrghqhyDDfvqtodwEEbdmxw",
      "type":"USER",
      "name":"Didier Lallemand",
      "link":"http://www.viadeo.com/profile/0022b9beh5emekny",
      "updated_time":"2012-11-24T01:22:34+0100"},
    "on":{
      "id":"",
      "type":"NEWS ITEM",
      "name":"",
      "link":"",
      "from":{
        "id":"sIckVxmOzsfVgzpxADDpyvngyw",
        "type":"USER",
        "name":"Trouveunjob Trouveunjob",
        "link":"http://www.viadeo.com/profile/0021ep7id14oqn1z",
        "updated_time":"2012-10-28T23:02:23+0100"},
      "label":"",
      "message":"",
      "title":"Offre d'emploi Directeur De Travaux Btp - Chef De Centre - Espace Emplois",
      "description":"Manpower Le Mans BTP recherche pour son client, dynamique société d'excellente notoriété, filiale d'un grand groupe international,...",
      "updated_time":"2012-11-23T20:24:19+0100",
      "infeed_link":"",
      "creation_date":"2012-11-23T20:24:19+0100",
      "comment_count":0,
      "like_count":1},
    "category":{
      "id":"dvAhdetpuEzOnqspEpblgfVqqk",
      "type":"NEWS CATEGORY",
      "name":"Articles viewed",
      "link":"",
      "updated_time":"2012-11-24T11:33:35+0100"},
    "label":"a consulté ",
    "message":"Offre d'emploi Directeur De Travaux Btp - Chef De Centre - Espace Emplois",
    "title":"Offre d'emploi Directeur De Travaux Btp - Chef De Centre - Espace Emplois",
    "description":"Manpower Le Mans BTP recherche pour son client, dynamique société d'excellente notoriété, filiale d'un grand groupe international,...",
    "language":"fr",
    "updated_time":"2012-11-24T01:24:52+0100",
    "infeed_link":"http://www.viadeo.com/shareit/redirect/?urlSharerId=0021dmhj8obv4bkb",
    "creation_date":"2012-11-24T01:24:52+0100",
    "comment_count":0,
    "like_count":0,
    "tags":["btp","cdd","chef de centre","emploi","emploi directeur","espace","interim","job","mission","moteur de recherche","offre","recrutement","stage","travail"]}
  ]}
    """
    
  def timelineErrorNoName = """
  {"data":[
  {"id":"siuvjxolhVagsbyszagliVbrAO",
    "type":"NEWS ITEM",
    "name":"",
    "link":"",
    "on":{
      "id":"siuvjxolhVagsbyszagliVbrAO",
      "type":"NEWS ITEM",
      "name":"",
      "link":"",
      "category":{
        "id":"dvAhdetpuEzOnqspEpblgfVqqk",
        "type":"NEWS CATEGORY",
        "name":"Articles viewed",
        "link":"",
        "updated_time":"2012-11-26T13:57:03+0100"},
      "label":"a consulté ",
      "message":"Amazon va créer 2.500 emplois en ouvrant un 4e centre en France - Challenges.fr",
      "title":"Amazon va créer 2.500 emplois en ouvrant un 4e centre en France - Challenges.fr",
      "description":"Le nouveau centre du distributeur en ligne américain devrait ouvrir au \"deuxième semestre 2013\" à Lauwin-Planque (Nord).",
      "picture":"http://static9.viadeo-static.com/images/photos/2/0022bv3uk8utt9tf/",
      "language":"fr",
      "updated_time":"2012-11-26T12:12:35+0100",
      "infeed_link":"http://www.viadeo.com/shareit/redirect/?urlSharerId=0022bv3uk8utt9tf",
      "creation_date":"2012-11-26T12:12:35+0100",
      "comment_count":0,
      "like_count":0,
      "tags":["2.500 emploi","4e centre","actualité","actualité économique","amazon","challenge","challenges.fr","france","high","ipad","iphone","multimédia","tablette","tech","technologie","web"]},
      "category":{
        "id":"dvAhdetpuEzOnqspEpblgfVqqk",
        "type":"NEWS CATEGORY",
        "name":"Articles viewed",
        "link":"",
        "updated_time":"2012-11-26T13:57:03+0100"},
      "label":"a consulté ",
      "message":"Amazon va créer 2.500 emplois en ouvrant un 4e centre en France - Challenges.fr",
      "title":"Amazon va créer 2.500 emplois en ouvrant un 4e centre en France - Challenges.fr",
      "description":"Le nouveau centre du distributeur en ligne américain devrait ouvrir au \"deuxième semestre 2013\" à Lauwin-Planque (Nord).",
      "picture":"http://static9.viadeo-static.com/images/photos/2/0022bv3uk8utt9tf/",
      "language":"fr",
      "updated_time":"2012-11-26T12:12:35+0100",
      "infeed_link":"http://www.viadeo.com/shareit/redirect/?urlSharerId=0022bv3uk8utt9tf",
      "creation_date":"2012-11-26T12:12:35+0100",
      "comment_count":0,
      "like_count":0,
      "tags":["2.500 emploi","4e centre","actualité","actualité économique","amazon","challenge","challenges.fr","france","high","ipad","iphone","multimédia","tablette","tech","technologie","web"]}
    ]
    """
    
  def timeline = """
    {"id":"",
    "type":"USER SMARTNEWS",
    "name":"Romain Maneschi",
    "link":"",
    "count":60,
    "paging":{"previous":"","next":"https://api.viadeo.com/abioDpIEgadzlhjurdlaDIEyjk/smart_news.json?limit=50&page=2&access_token=b937103201c9c92df44b07a60fb9cb8e"},
    "updated_time":"2012-11-17T15:56:17+0100",
    "count_string":"60","data":[
    {"id":"VruohkDlennxkrmfjnDyEhmilk",
    "type":"NEWS ITEM",
    "name":"",
    "link":"",
    "from":{
      "id":"bAiEaxlIdvxvxkuOwoqIewEgdc",
      "type":"USER",
      "name":"Corinne Vilcaz",
      "link":"http://www.viadeo.com/profile/00225qlvwhfltih0",
      "updated_time":"2012-09-29T12:12:29+0200"},
    "on":{
      "id":"snbVzpnwucdutEmvzmpIelOwxk",
      "type":"GROUP MESSAGE",
      "name":"",
      "link":"http://www.viadeo.com/hub/forums/detaildiscussion/?containerId=00227skvm1xbd7zw&action=messageDetail&messageId=0029ekqwq4o5uke&forumId=0021kk9os0v32ubv",
      "author":{
        "id":"bAiEaxlIdvxvxkuOwoqIewEgdc",
        "type":"USER",
        "name":"Corinne Vilcaz",
        "link":"http://www.viadeo.com/profile/00225qlvwhfltih0","updated_time":"2012-09-29T12:12:29+0200"},
      "title":"VILCAZ au CARROUSEL DU LOUVRE en expo au Salon National des Beaux Arts",
      "forum":{
        "id":"EViqkpEsEinAxyVrrwmuxhbkqg",
        "type":"GROUP FORUM",
        "name":"Communiqués de presse",
        "link":"","updated_time":"2012-11-17T15:56:16+0100"},
      "message":"Le Salon National des Beaux Arts présente son grand salon annuel au Carrousel du Louvre du 13 au 16 décembre 2012. Retrouvez Vilcaz avec son oeuvre : \"Au...","updated_time":"2012-11-17T15:20:03+0100","hub_category":{"id":"AsgdnanbdDmmwfdxAdhcawhIjc","name":"Métiers - Communication - Publicité"},"view_count":0,"comment_count":0,"like_count":0},"category":{"id":"fkEvfminebzdejraDzDOmwbves","type":"NEWS CATEGORY","name":"Forum messages","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"a posté un nouveau message : ","message":"VILCAZ au CARROUSEL DU LOUVRE en expo au Salon National des Beaux Arts","picture":"www.viadeo.com/images/photos/0/1353161995157-00225qlvwhfltih0-00227skvm1xbd7zw/thumb","language":"fr","updated_time":"2012-11-17T15:20:03+0100","infeed_link":"http://www.viadeo.com/hub/forums/affichepost/?postId=0029ekqwq4o5uke","creation_date":"2012-11-17T15:20:03+0100","comment_count":0,"like_count":0,"tags":["art","art contemporain","cinéma","communication","culture","fondation","louvre en expo","marketing","monument","musique","musée","mécénat","médiation culturel","public","salon national","vilcaz au carrousel"]},
    {"id":"bipjabbvomhxifAjucIywOqIug","type":"NEWS ITEM","name":"","link":"","from":{"id":"fmgDjIabmoqssoyfbvmDjreVjs","type":"USER","name":"Rodrigue GAKPARA","link":"http://www.viadeo.com/profile/0021ln14f9dql19","updated_time":"2012-11-17T15:41:16+0100"},"on":{"id":"bEgblumzowVyzsabqAiOIytiyk","type":"GROUP MESSAGE","name":"","link":"http://www.viadeo.com/hub/forums/detaildiscussion/?containerId=002madziq3ii9rq&action=messageDetail&messageId=002zl46boxuyue&forumId=0021u9ce333rd79v","author":{"id":"fmgDjIabmoqssoyfbvmDjreVjs","type":"USER","name":"Rodrigue GAKPARA","link":"http://www.viadeo.com/profile/0021ln14f9dql19","updated_time":"2012-11-17T15:41:16+0100"},"title":"rentrez dans notre réseau","forum":{"id":"vAEvnDOVyOdbwzwIpjumIpAwhs","type":"GROUP FORUM","name":"Communiqués de presse","link":"","updated_time":"2012-11-17T15:56:16+0100"},"message":"PLAGA-PRODUCTION cherche des partenaires pour publier ses clips vidéos,films et autres sur les chaînes internationnaux","updated_time":"2012-11-17T14:36:58+0100","hub_category":{"id":"nvtfOesOwyEjslobnkiywqEimA","name":"Art et Culture - Musique - Danse"},"view_count":0,"comment_count":0,"like_count":0},"category":{"id":"fkEvfminebzdejraDzDOmwbves","type":"NEWS CATEGORY","name":"Forum messages","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"a posté un nouveau message : ","message":"rentrez dans notre réseau","language":"fr","updated_time":"2012-11-17T14:36:58+0100","infeed_link":"http://www.viadeo.com/hub/forums/affichepost/?postId=002zl46boxuyue","creation_date":"2012-11-17T14:36:58+0100","comment_count":0,"like_count":0,"tags":["cd","chanteur","dvd","editions","marketing","musique","production","réseau"]},
    {"id":"edyuwqqfDaOzwydksqiAAjnVAs","type":"NEWS ITEM","name":"","link":"","from":{"id":"IqVDEEwyDObVtvdynIExyappag","type":"USER","name":"Virginie Arquillière","link":"http://www.viadeo.com/profile/002yh7jwidzkgcp","updated_time":"2012-11-11T12:26:52+0100"},"on":{"id":"zrpleVAzpEwtbvniabkOEVzrhw","type":"GROUP MESSAGE","name":"","link":"http://www.viadeo.com/hub/forums/detaildiscussion/?containerId=0021f5subrx1m4r1&action=messageDetail&messageId=002sqx0y1s6hfxp&forumId=0023ybu04ahnfqd","author":{"id":"IqVDEEwyDObVtvdynIExyappag","type":"USER","name":"Virginie Arquillière","link":"http://www.viadeo.com/profile/002yh7jwidzkgcp","updated_time":"2012-11-11T12:26:52+0100"},"title":"Re: Votre cerveau contrôle vos actions et vos réactions","forum":{"id":"khIcltvoDOVeswcpnzmyqpbeqk","type":"GROUP FORUM","name":"Forum de discussion","link":"","updated_time":"2012-11-17T15:56:16+0100"},"message":"Je suis entièrement d'accord avec ette approche neuroscientifique de l'éducation et de la pédagogie ; les éducateurs ainsi que les profs devraient en tenir...","updated_time":"2012-11-17T13:56:48+0100","hub_category":{"id":"AimbjoqkhOvfhxmsdwhrDezVsg","name":"Jobs et Carrières - Formation professionnelle"},"view_count":0,"comment_count":0,"like_count":0},"category":{"id":"fkEvfminebzdejraDzDOmwbves","type":"NEWS CATEGORY","name":"Forum messages","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"a posté un nouveau message : ","message":"Re: Votre cerveau contrôle vos actions et vos réactions","language":"fr","updated_time":"2012-11-17T13:56:48+0100","infeed_link":"http://www.viadeo.com/hub/forums/affichepost/?postId=002sqx0y1s6hfxp","creation_date":"2012-11-17T13:56:48+0100","comment_count":0,"like_count":0,"tags":["action","apprentissage","cerveau","distance","e-learning","formation","ingénierie pédagogique","motivation","mémorisation","neuroscience","objectif","orientation","pédagogues","réactions","tableau interactif","technologie","échec scolaire"]},
    {"id":"IqibIowpkuVahbnyjbimsvjhqk","type":"NEWS ITEM","name":"","link":"","from":{"id":"noeqnvtzgrjjfswcikixIykEOo","type":"USER","name":"François L.","link":"http://www.viadeo.com/profile/002va4m5dk9va8c","updated_time":"2012-11-17T14:11:54+0100"},"on":{"id":"tmOdvmDAaukpokzqxgOfsnwbaO","type":"GROUP MESSAGE","name":"","link":"http://www.viadeo.com/hub/forums/detaildiscussion/?containerId=002hi0xcymmgxzt&action=messageDetail&messageId=00220ww8s77nsn0w&forumId=002kftyjdv0z4cm","author":{"id":"noeqnvtzgrjjfswcikixIykEOo","type":"USER","name":"François L.","link":"http://www.viadeo.com/profile/002va4m5dk9va8c","updated_time":"2012-11-17T14:11:54+0100"},"title":"Re: Xebia accueille la 27e soirée du Paris Scala User Group","forum":{"id":"cqgbwjduDtVjevkbafwclgddns","type":"GROUP FORUM","name":"Scala","link":"","updated_time":"2012-11-17T15:56:16+0100"},"message":"Bonjour, je crois que je m'y suis pris un peu tard, il restait hier 3 places sur eventbrite mais impossible de m'y inscrire ( id invalid .. ) , aujourd'hui...","updated_time":"2012-11-17T13:49:25+0100","hub_category":{"id":"ntViiwOhfVAhkgidzvdxswgmxO","name":"Informatique - Internet - Télécom - Multimedia - Développement et langages"},"view_count":0,"comment_count":0,"like_count":0},"category":{"id":"fkEvfminebzdejraDzDOmwbves","type":"NEWS CATEGORY","name":"Forum messages","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"a posté un nouveau message : ","message":"Re: Xebia accueille la 27e soirée du Paris Scala User Group","language":"fr","updated_time":"2012-11-17T13:49:25+0100","infeed_link":"http://www.viadeo.com/hub/forums/affichepost/?postId=00220ww8s77nsn0w","creation_date":"2012-11-17T13:49:25+0100","comment_count":0,"like_count":0,"tags":["clojure","fan","fantom","grails","groovy","group","java","javafx","javascript","jruby","jvm","jython","lift","python","rhino","ruby","scala","soirée du pari","xebia"]},
    {"id":"ocDaljesAizwvkIEuyiyumwIsk","type":"NEWS ITEM","name":"","link":"","from":{"id":"tVDuEEOfnrktbAzoAveihakAok","type":"USER","name":"Cecile Molliet","link":"http://www.viadeo.com/profile/00212ujql8en9fiw","updated_time":"2012-11-13T16:37:23+0100"},"on":{"id":"fboIyjIqADvzaIIbEgluqzpizs","type":"GROUP MESSAGE","name":"","link":"http://www.viadeo.com/hub/forums/detaildiscussion/?containerId=0027lpr4q5b71zk&action=messageDetail&messageId=0021woevhoe4b6xi&forumId=0022d1hw5ob3dzd5","author":{"id":"tVDuEEOfnrktbAzoAveihakAok","type":"USER","name":"Cecile Molliet","link":"http://www.viadeo.com/profile/00212ujql8en9fiw","updated_time":"2012-11-13T16:37:23+0100"},"title":"Re: Coach ou Mentor ?","forum":{"id":"fiaAhkaVixeIsspfDigVEbkEfs","type":"GROUP FORUM","name":"Forum de discussion","link":"","updated_time":"2012-11-17T15:56:16+0100"},"message":"Bonjour Ghislaine,  La posture n'est pas la même. Pour moi un mentor peut tout à fait adopter une posture de coach quand il le juge bénéfique pour l'apprentissage...","updated_time":"2012-11-17T13:30:40+0100","hub_category":{"id":"jgbEbdDotamceEefbyoqxfrsec","name":"Jobs et Carrières - Coaching et Accompagnement"},"view_count":0,"comment_count":0,"like_count":0},"category":{"id":"fkEvfminebzdejraDzDOmwbves","type":"NEWS CATEGORY","name":"Forum messages","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"a posté un nouveau message : ","message":"Re: Coach ou Mentor ?","language":"fr","updated_time":"2012-11-17T13:30:40+0100","infeed_link":"http://www.viadeo.com/hub/forums/affichepost/?postId=0021woevhoe4b6xi","creation_date":"2012-11-17T13:30:40+0100","comment_count":0,"like_count":0,"tags":["bien-être","choix","clarification","coach","coaching","communication","gestion","maïeutique","mentor","performance","socrate","stress","sérénité"]},
    {"id":"VtcIxAtpVhbxyAxEoDqzxVVzew","type":"NEWS ITEM","name":"","link":"","from":{"id":"ogguAswDroDEyhAaqtvDimofOO","type":"USER","name":"Valérie Vimeney","link":"http://www.viadeo.com/profile/0021h9cqq0jxb530","updated_time":"2012-11-10T14:06:01+0100"},"to":{"id":"AtjmxuwnnhAEqArtpbeAxuyheO","type":"USER","name":"Cecile Verstraete","link":"http://www.viadeo.com/profile/0021ieg13u55sfpy","updated_time":"2012-11-17T13:55:19+0100"},"category":{"id":"zqgEIgyIizabkboEtVhOomjeqc","type":"NEWS CATEGORY","name":"New contacts","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"a un nouveau contact : ","message":"Cecile Verstraete","language":"fr","updated_time":"2012-11-17T13:24:51+0100","infeed_link":"http://www.viadeo.com/recherche/profil/?memberId=0021ieg13u55sfpy","creation_date":"2012-11-17T13:24:51+0100","comment_count":0,"like_count":0,"tags":["accompagnement","aide","art","auto-entrepreneur","coaching","conseil","cour|cours","création","développement personnel","entreprise","formation","freelance","indépendant","massage","pari","relation aide","relaxation","rencontre","santé","service","écriture","énergie"]},
    {"id":"VEnjvpihDvmsjDwvzukpsEqjDc","type":"NEWS ITEM","name":"","link":"","from":{"id":"hapEbwEnqAlqmgykyhhaqkAoOA","type":"USER","name":"Jean-michel Zamore","link":"http://www.viadeo.com/profile/00219tdzii3tnubc","updated_time":"2012-10-27T07:22:37+0200"},"on":{"id":"ukmtgdvfqhAwIhfnbDrokyAhsw","type":"GROUP MESSAGE","name":"","link":"http://www.viadeo.com/hub/forums/detaildiscussion/?containerId=00217l9lme2jbn0e&action=messageDetail&messageId=00222abf26lu1j5e&forumId=00224ib7r6gne3g6","author":{"id":"hapEbwEnqAlqmgykyhhaqkAoOA","type":"USER","name":"Jean-michel Zamore","link":"http://www.viadeo.com/profile/00219tdzii3tnubc","updated_time":"2012-10-27T07:22:37+0200"},"title":"SEMINAIRE OBTENIR DES FINANCEMENTS EUROPEENS - BORDEAUX","forum":{"id":"cAuagzgdjgzgIAjetozitidsbo","type":"GROUP FORUM","name":"Forum de discussion","link":"","updated_time":"2012-11-17T15:56:16+0100"},"message":"Bonjour,  Après les succès de nos derniers séminaires (100 % des stagiaires ont été très satisfaits)  Plus de 21 Milliards d’euros ont déjà été alloués...","updated_time":"2012-11-17T13:15:16+0100","hub_category":{"id":"algeudneEpyyOdrqwAmEqrdIzw","name":"Club Business - France"},"view_count":0,"comment_count":0,"like_count":0},"category":{"id":"fkEvfminebzdejraDzDOmwbves","type":"NEWS CATEGORY","name":"Forum messages","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"a posté un nouveau message : ","message":"SEMINAIRE OBTENIR DES FINANCEMENTS EUROPEENS - BORDEAUX","language":"fr","updated_time":"2012-11-17T13:15:16+0100","infeed_link":"http://www.viadeo.com/hub/forums/affichepost/?postId=00222abf26lu1j5e","creation_date":"2012-11-17T13:15:16+0100","comment_count":0,"like_count":0,"tags":["bar","bordeau|bordeaux","cockta","conseil","consultant","europeens","financement","lyon","pari","rencontre","restaurant"]},
    {"id":"xpwmbvbimOorVbzlmnOldnsVIA","type":"NEWS ITEM","name":"","link":"","from":{"id":"wbqvtOniohqbidOfwjxgyxbgnO","type":"USER","name":"Nakous Mustapha","link":"http://www.viadeo.com/profile/002in0a9zg5hah8","updated_time":"2012-11-08T22:56:55+0100"},"on":{"id":"xpwmbvbimOorVbzlmnOldnsVIA","type":"NEWS ITEM","name":"","link":"","from":{"id":"wbqvtOniohqbidOfwjxgyxbgnO","type":"USER","name":"Nakous Mustapha","link":"http://www.viadeo.com/profile/002in0a9zg5hah8","updated_time":"2012-11-08T22:56:55+0100"},"category":{"id":"elvIfxjayEhzxantxtgtErncpO","type":"NEWS CATEGORY","name":"Status","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"Status : ","message":"OSclasse - crée site annonces gratuitement http://t.co/FgJaHrM2","title":"OSclasse - crée site annonces gratuitement | Le Script","description":"OSclasse - crée site annonces gratuitement","picture":"http://static9.viadeo-static.com/images/photos/2/00229afwbdkeks1i/","language":"fr","updated_time":"2012-11-17T11:10:31+0100","infeed_link":"http://t.co/FgJaHrM2","creation_date":"2012-11-17T11:10:31+0100","comment_count":0,"like_count":0,"tags":["annonce","osclasse","script","site"]},"category":{"id":"elvIfxjayEhzxantxtgtErncpO","type":"NEWS CATEGORY","name":"Status","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"Status : ","message":"OSclasse - crée site annonces gratuitement http://t.co/FgJaHrM2","title":"OSclasse - crée site annonces gratuitement | Le Script","description":"OSclasse - crée site annonces gratuitement","picture":"http://static9.viadeo-static.com/images/photos/2/00229afwbdkeks1i/","language":"fr","updated_time":"2012-11-17T11:10:31+0100","infeed_link":"http://t.co/FgJaHrM2","creation_date":"2012-11-17T11:10:31+0100","comment_count":0,"like_count":0,"tags":["annonce","osclasse","script","site"]},
    {"id":"zidsydynobrVbxntIgsilAqtEo","type":"NEWS ITEM","name":"","link":"","from":{"id":"nqAygxdllliyponoxDdoicAfqO","type":"USER","name":"Isabelle SZCZACHOR","link":"http://www.viadeo.com/profile/0021x64lfq2epvnv","updated_time":"2012-11-17T10:57:53+0100"},"on":{"id":"wkujpgDoODlDlmOImtgwegDslk","type":"GROUP MESSAGE","name":"","link":"http://www.viadeo.com/hub/forums/detaildiscussion/?containerId=002qbn4jrfa9687&action=messageDetail&messageId=00213rwlz0485j82&forumId=0021wb04h7v0allb","author":{"id":"nqAygxdllliyponoxDdoicAfqO","type":"USER","name":"Isabelle SZCZACHOR","link":"http://www.viadeo.com/profile/0021x64lfq2epvnv","updated_time":"2012-11-17T10:57:53+0100"},"title":"Romantic saxophone - desperado","forum":{"id":"oihqumtcIpcqAVuogjAhokcOwA","type":"GROUP FORUM","name":"La table : des musiciens","link":"","updated_time":"2012-11-17T15:56:16+0100"},"message":"Bonjour à tou(te)s,  C'est sur un air de saxophone que je vous souhaite de passer un bon week end.  Une musique enivrante...  Musicalement vôtre,  Isabelle","updated_time":"2012-11-17T10:46:46+0100","hub_category":{"id":"kmExreDDjwerawjtkfujsAOsic","name":"Art et Culture - Littérature, Poésie et Philosophie"},"view_count":3,"comment_count":0,"like_count":0},"category":{"id":"fkEvfminebzdejraDzDOmwbves","type":"NEWS CATEGORY","name":"Forum messages","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"a posté un nouveau message : ","message":"Romantic saxophone - desperado","picture":"http://i4.ytimg.com/vi/wTl0-bDfamU/hqdefault.jpg","language":"fr","updated_time":"2012-11-17T10:46:46+0100","infeed_link":"http://www.viadeo.com/hub/forums/affichepost/?postId=00213rwlz0485j82","creation_date":"2012-11-17T10:46:46+0100","comment_count":0,"like_count":0,"tags":["auteur","business","cinéma","club","desperado","dessinateur","environnement","gastronomie","graphiste","histoire","humour","littérature","musicien","musique","peintre","philosophie","poésie","rire","romantic","saxophone","théâtre","vin","voyage","écrivain"]},
    {"id":"dhymcVtzpvfdjnfkaqipqgvnuc","type":"NEWS ITEM","name":"","link":"","from":{"id":"birlVpmOwhintlzdgclcmfmzuO","type":"USER","name":"Frederic Lohbrunner","link":"http://www.viadeo.com/profile/002173pbg6za7h4e","updated_time":"2012-07-02T23:36:57+0200"},"category":{"id":"elvIfxjayEhzxantxtgtErncpO","type":"NEWS CATEGORY","name":"Status","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"Status : ","message":"Rice is a Good Source of… http://t.co/Tovfq9sb #conseils","language":"fr","updated_time":"2012-11-17T09:07:15+0100","infeed_link":"http://t.co/Tovfq9sb","creation_date":"2012-11-17T09:07:15+0100","comment_count":0,"like_count":0,"tags":["#conseils","rice","source"]},
    {"id":"jOdnAwaEDbazyEhatncbIIuhvg","type":"NEWS ITEM","name":"","link":"","from":{"id":"wDhvspoyhuVzjdanmbIvyDAdAo","type":"USER","name":"Patrice A.","link":"http://www.viadeo.com/profile/002zm2eqnnz3b4b","updated_time":"2012-10-28T10:12:04+0100"},"on":{"id":"kEhwnmdnciejhxcyDVOqeDjoeA","type":"GROUP MESSAGE","name":"","link":"http://www.viadeo.com/hub/forums/detaildiscussion/?containerId=002yam99ayagi07&action=messageDetail&messageId=0021wk76r5pjj76o&forumId=00218nrdoxc88rl4","author":{"id":"wDhvspoyhuVzjdanmbIvyDAdAo","type":"USER","name":"Patrice A.","link":"http://www.viadeo.com/profile/002zm2eqnnz3b4b","updated_time":"2012-10-28T10:12:04+0100"},"title":"Présentation de Prof Tux","forum":{"id":"hiwExyekpmfmlffEyeioEaEzao","type":"GROUP FORUM","name":"Offres business","link":"","updated_time":"2012-11-17T15:56:16+0100"},"message":"Bonjour,  J'ai récemment lancé Prof Tux ( http://prof-tux.fr/ ), une boutique de vente en ligne de cours et conseils sur le système libre et gratuit Gnu...","updated_time":"2012-11-17T06:28:32+0100","hub_category":{"id":"ujmOAcqkdsakdudywjOqVsxckw","name":"Informatique - Internet - Télécom - Multimedia - PC, Mac, Bureautique"},"view_count":0,"comment_count":0,"like_count":0},"category":{"id":"fkEvfminebzdejraDzDOmwbves","type":"NEWS CATEGORY","name":"Forum messages","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"a posté un nouveau message : ","message":"Présentation de Prof Tux","language":"fr","updated_time":"2012-11-17T06:28:32+0100","infeed_link":"http://www.viadeo.com/hub/forums/affichepost/?postId=0021wk76r5pjj76o","creation_date":"2012-11-17T06:28:32+0100","comment_count":0,"like_count":0,"tags":["debian","free","linux","logiciel libre","openoffice","openoffice.org","présentation de prof","redhat","tux"]},
    {"id":"hbkodIbledObEdEwOvwgAVkyuo","type":"NEWS ITEM","name":"","link":"","from":{"id":"mAgsuvxirdoqAsczpwixxymAgs","type":"USER","name":"Hélène Deschamp","link":"http://www.viadeo.com/profile/002mv2pqck11k4i","updated_time":"2012-10-29T11:18:16+0100"},"on":{"id":"DcltnivkufwgvbhqDjcnlagtow","type":"GROUP MESSAGE","name":"","link":"http://www.viadeo.com/hub/forums/detaildiscussion/?containerId=002qbn4jrfa9687&action=messageDetail&messageId=002mwoq9hiakw63&forumId=002dittfvcpof0b","author":{"id":"mAgsuvxirdoqAsczpwixxymAgs","type":"USER","name":"Hélène Deschamp","link":"http://www.viadeo.com/profile/002mv2pqck11k4i","updated_time":"2012-10-29T11:18:16+0100"},"title":"Re: Peut-on cerner l'homme?","forum":{"id":"EhtuDgqVxzmAlDEpvkrtpglukk","type":"GROUP FORUM","name":"La table : des philosophes","link":"","updated_time":"2012-11-17T15:56:16+0100"},"message":"@ Marianne Merci de cette précision, c'est effectivement à vous que ma question était adressée. Par ailleurs, je me suis rendu compte que ma question...","updated_time":"2012-11-17T01:01:48+0100","hub_category":{"id":"kmExreDDjwerawjtkfujsAOsic","name":"Art et Culture - Littérature, Poésie et Philosophie"},"view_count":0,"comment_count":0,"like_count":0},"category":{"id":"fkEvfminebzdejraDzDOmwbves","type":"NEWS CATEGORY","name":"Forum messages","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"a posté un nouveau message : ","message":"Re: Peut-on cerner l'homme?","language":"fr","updated_time":"2012-11-17T01:01:48+0100","infeed_link":"http://www.viadeo.com/hub/forums/affichepost/?postId=002mwoq9hiakw63","creation_date":"2012-11-17T01:01:48+0100","comment_count":0,"like_count":0,"tags":["auteur","business","cinéma","club","dessinateur","environnement","gastronomie","graphiste","histoire","homme","humour","littérature","musicien","musique","peintre","peut-on","philosophie","poésie","rire","théâtre","vin","voyage","écrivain"]},
    {"id":"vtpdaEiowDurIvlcEmydfDjnkO","type":"NEWS ITEM","name":"","link":"","from":{"id":"dOxiOrwyedisgxtrcAldmxuOms","type":"USER","name":"Jean-Jacques FULGONI","link":"http://www.viadeo.com/profile/0022afiuthzvo2z2","updated_time":"2012-11-12T22:26:48+0100"},"on":{"id":"iVioxnsrfIsrzhkEqqxfissiyc","type":"GROUP MESSAGE","name":"","link":"http://www.viadeo.com/hub/forums/detaildiscussion/?containerId=00228flt2cyau3d&action=messageDetail&messageId=0029w43cwdejq8i&forumId=0021gtrpl7nvf036","author":{"id":"dOxiOrwyedisgxtrcAldmxuOms","type":"USER","name":"Jean-Jacques FULGONI","link":"http://www.viadeo.com/profile/0022afiuthzvo2z2","updated_time":"2012-11-12T22:26:48+0100"},"title":"Création d'une place de marché informatique gratuite","forum":{"id":"djbODrwmtDVnbkoqyqbqsmqDrk","type":"GROUP FORUM","name":"Offres business","link":"","updated_time":"2012-11-17T15:56:16+0100"},"message":"Bonjour  ECI Conseils vous annonce la création d'une place de marché informatique gratuite  - Pour trouver des compétences disponibles immédiatement  Déjà...","updated_time":"2012-11-16T22:41:49+0100","hub_category":{"id":"basbpnoExIzaxdoEkfcvhDaxiA","name":"Informatique - Internet - Télécom - Multimedia - Divers"},"view_count":1,"comment_count":0,"like_count":0},"category":{"id":"fkEvfminebzdejraDzDOmwbves","type":"NEWS CATEGORY","name":"Forum messages","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"a posté un nouveau message : ","message":"Création d'une place de marché informatique gratuite","language":"fr","updated_time":"2012-11-16T22:41:49+0100","infeed_link":"http://www.viadeo.com/hub/forums/affichepost/?postId=0029w43cwdejq8i","creation_date":"2012-11-16T22:41:49+0100","comment_count":0,"like_count":0,"tags":["consultant","création","formateur","freelances","indépendants","informatique","place de marché","secteur it","ssi","une"]},
    {"id":"voevsAfAakjmIyiqhgwxDgbecg","type":"NEWS ITEM","name":"","link":"","from":{"id":"nujlIvjzvqqyuIeIIbybmiIhtA","type":"USER","name":"Emploidunet.fr -  Offres d'emploi E-business","link":"http://www.viadeo.com/profile/002248eiz2eq7wqm","updated_time":"2012-07-05T23:51:30+0200"},"on":{"id":"voevsAfAakjmIyiqhgwxDgbecg","type":"NEWS ITEM","name":"","link":"","from":{"id":"nujlIvjzvqqyuIeIIbybmiIhtA","type":"USER","name":"Emploidunet.fr -  Offres d'emploi E-business","link":"http://www.viadeo.com/profile/002248eiz2eq7wqm","updated_time":"2012-07-05T23:51:30+0200"},"category":{"id":"elvIfxjayEhzxantxtgtErncpO","type":"NEWS CATEGORY","name":"Status","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"Status : ","message":"Contrat d'apprentissage / Alternance - Développeur web PHP/MySQL en alternance 2 - IP FORMATION - St Etienne http://t.co/8IHyxfFS","title":"Développeur web PHP/MySQL en alternance 2 - IP FORMATION - Offres d'emploi sur emploidunet.fr","description":"Entreprise partenaire d'Ip-Formation recherche dans le cadre d'une formation alternance de 14 mois de Responsable de Projet Informatique...","picture":"http://static9.viadeo-static.com/images/photos/2/0021k5c0ecdq1h0z/","language":"fr","updated_time":"2012-11-16T17:30:36+0100","infeed_link":"http://t.co/8IHyxfFS","creation_date":"2012-11-16T17:30:36+0100","comment_count":0,"like_count":0,"tags":["alternance","apprentissage","contrat","développeur","emploi sur emploidunet.fr","formation","ip","offre","php/mysql en alternance","st etienne","web"]},"category":{"id":"elvIfxjayEhzxantxtgtErncpO","type":"NEWS CATEGORY","name":"Status","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"Status : ","message":"Contrat d'apprentissage / Alternance - Développeur web PHP/MySQL en alternance 2 - IP FORMATION - St Etienne http://t.co/8IHyxfFS","title":"Développeur web PHP/MySQL en alternance 2 - IP FORMATION - Offres d'emploi sur emploidunet.fr","description":"Entreprise partenaire d'Ip-Formation recherche dans le cadre d'une formation alternance de 14 mois de Responsable de Projet Informatique...","picture":"http://static9.viadeo-static.com/images/photos/2/0021k5c0ecdq1h0z/","language":"fr","updated_time":"2012-11-16T17:30:36+0100","infeed_link":"http://t.co/8IHyxfFS","creation_date":"2012-11-16T17:30:36+0100","comment_count":0,"like_count":0,"tags":["alternance","apprentissage","contrat","développeur","emploi sur emploidunet.fr","formation","ip","offre","php/mysql en alternance","st etienne","web"]},
    {"id":"AfdVvqroqiwebyoezelfEbDwbA","type":"NEWS ITEM","name":"","link":"","from":{"id":"zbpvzmohsfzktxIdbIhrohegak","type":"USER","name":"Melina Rodriguez","link":"http://www.viadeo.com/profile/00228zvtkrufn4i9","updated_time":"2012-07-24T00:09:16+0200"},"on":{"id":"AfdVvqroqiwebyoezelfEbDwbA","type":"NEWS ITEM","name":"","link":"","from":{"id":"zbpvzmohsfzktxIdbIhrohegak","type":"USER","name":"Melina Rodriguez","link":"http://www.viadeo.com/profile/00228zvtkrufn4i9","updated_time":"2012-07-24T00:09:16+0200"},"category":{"id":"elvIfxjayEhzxantxtgtErncpO","type":"NEWS CATEGORY","name":"Status","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"Status : ","message":"Hiring an Analyste Programmeur .NET in Montreal, QC Canada http://t.co/Gd6FXJhD #job","title":"Analyste Programmeur .NET in Montreal, QC Canada | Bullhorn Reach","description":"Sous la supervision de la directrice service des technologies de l'information, l'Analyste-programmeur participe aux activités reliées au...","language":"fr","updated_time":"2012-11-16T16:53:20+0100","infeed_link":"http://t.co/Gd6FXJhD","creation_date":"2012-11-16T16:53:20+0100","comment_count":0,"like_count":0,"tags":["#job","an","analyste","bullhorn","canada","hiring","montreal","programmeur","qc","reach"]},"category":{"id":"elvIfxjayEhzxantxtgtErncpO","type":"NEWS CATEGORY","name":"Status","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"Status : ","message":"Hiring an Analyste Programmeur .NET in Montreal, QC Canada http://t.co/Gd6FXJhD #job","title":"Analyste Programmeur .NET in Montreal, QC Canada | Bullhorn Reach","description":"Sous la supervision de la directrice service des technologies de l'information, l'Analyste-programmeur participe aux activités reliées au...","language":"fr","updated_time":"2012-11-16T16:53:20+0100","infeed_link":"http://t.co/Gd6FXJhD","creation_date":"2012-11-16T16:53:20+0100","comment_count":0,"like_count":0,"tags":["#job","an","analyste","bullhorn","canada","hiring","montreal","programmeur","qc","reach"]},
    {"id":"OtjjgjvymejOoIEauhpxsuwpIg","type":"NEWS ITEM","name":"","link":"","from":{"id":"wbqvtOniohqbidOfwjxgyxbgnO","type":"USER","name":"Nakous Mustapha","link":"http://www.viadeo.com/profile/002in0a9zg5hah8","updated_time":"2012-11-08T22:56:55+0100"},"on":{"id":"OtjjgjvymejOoIEauhpxsuwpIg","type":"NEWS ITEM","name":"","link":"","from":{"id":"wbqvtOniohqbidOfwjxgyxbgnO","type":"USER","name":"Nakous Mustapha","link":"http://www.viadeo.com/profile/002in0a9zg5hah8","updated_time":"2012-11-08T22:56:55+0100"},"category":{"id":"elvIfxjayEhzxantxtgtErncpO","type":"NEWS CATEGORY","name":"Status","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"Status : ","message":"OSclasse - crée site annonces gratuitement: Description:\nAvec OSClass, obtenir votre propre site petites annonce... http://t.co/4N3BDmUm","title":"OSclasse - crée site annonces gratuitement | Le Script","description":"OSclasse - crée site annonces gratuitement","picture":"http://static9.viadeo-static.com/images/photos/2/002vi337m5j1tt6/","language":"fr","updated_time":"2012-11-17T11:05:20+0100","infeed_link":"http://t.co/4N3BDmUm","creation_date":"2012-11-17T11:05:20+0100","comment_count":0,"like_count":0,"tags":["annonce","description","osclass","osclasse","script","site","site petit"]},"category":{"id":"elvIfxjayEhzxantxtgtErncpO","type":"NEWS CATEGORY","name":"Status","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"Status : ","message":"OSclasse - crée site annonces gratuitement: Description:\nAvec OSClass, obtenir votre propre site petites annonce... http://t.co/4N3BDmUm","title":"OSclasse - crée site annonces gratuitement | Le Script","description":"OSclasse - crée site annonces gratuitement","picture":"http://static9.viadeo-static.com/images/photos/2/002vi337m5j1tt6/","language":"fr","updated_time":"2012-11-17T11:05:20+0100","infeed_link":"http://t.co/4N3BDmUm","creation_date":"2012-11-17T11:05:20+0100","comment_count":0,"like_count":0,"tags":["annonce","description","osclass","osclasse","script","site","site petit"]},
    {"id":"IeDmuIwDAlvIuVmtsjteIwiqqg","type":"NEWS ITEM","name":"","link":"","from":{"id":"djpmaxgmbxhndmtrfVtofdyodO","type":"USER","name":"ISSA BAYALA","link":"http://www.viadeo.com/profile/0021johazsj9old3","updated_time":"2012-11-17T11:05:49+0100"},"on":{"id":"nsomOOmbpIcjhkqEvngIhmssso","type":"GROUP MESSAGE","name":"","link":"http://www.viadeo.com/hub/forums/detaildiscussion/?containerId=0021znig23e3f65z&action=messageDetail&messageId=0021xgegrjhgjei0&forumId=0021dvxb5rga15b","author":{"id":"fadswIDEVoEiseljbxfiktalpw","type":"USER","name":"Pascal Caillerez","link":"http://www.viadeo.com/profile/00245rgoi7z74lb","updated_time":"2012-11-12T10:26:42+0100"},"title":"Les enseignants veulent repenser la salle de classe pour intégrer les NTIC","forum":{"id":"stsrEOVsOApAgsjbtEOiVxbtIs","type":"GROUP FORUM","name":"Décideur Public - Systèmes d'Information","link":"","updated_time":"2012-11-17T15:56:16+0100"},"message":"Steelcase Education Solutions a mandaté Ipsos pour réaliser une enquête, auprès de 404 enseignants interrogés par internet, afin de dresser un état des...","updated_time":"2012-11-14T09:45:41+0100","hub_category":{"id":"oxVhyDbueOhgcxjxkcEncircwg","name":"Secteurs Economiques - Presse - Médias - Audiovisuel"},"view_count":1,"comment_count":0,"like_count":1},"category":{"id":"dvIrjVbprqkymwotkAoesEyDrc","type":"NEWS CATEGORY","name":"What you found interesting in Forum discussions","link":"","updated_time":"2012-11-17T15:56:16+0100"},"label":"a posté un nouveau message : ","message":"Les enseignants veulent repenser la salle de classe pour intégrer les NTIC","language":"fr","updated_time":"2012-11-17T09:28:38+0100","infeed_link":"http://www.viadeo.com/hub/forums/affichepost/?postId=0021xgegrjhgjei0","creation_date":"2012-11-17T09:28:38+0100","comment_count":0,"like_count":0,"tags":["actualité","administration","collectivité","département","enseignant","erp","gouvernance","information","infrastructure","internet","logiciel","mairie","management","ministère","ntic","presse","projet","public","région","salle de classe","service","source","système","sécurité"]}
]}
    """
  
}