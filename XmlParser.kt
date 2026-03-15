class XmlParser {

    fun readSprites(xml:InputStream):List<Sprite>{

        val list = mutableListOf<Sprite>()

        val parser = Xml.newPullParser()
        parser.setInput(xml,"utf-8")

        var event = parser.eventType

        while(event != XmlPullParser.END_DOCUMENT){

            if(event == XmlPullParser.START_TAG){

                if(parser.name == "Image"){

                    val name = parser.getAttributeValue(null,"name")
                    val x = parser.getAttributeValue(null,"x").toInt()
                    val y = parser.getAttributeValue(null,"y").toInt()
                    val w = parser.getAttributeValue(null,"w").toInt()
                    val h = parser.getAttributeValue(null,"h").toInt()

                    list.add(Sprite(name,x,y,w,h))
                }
            }

            event = parser.next()
        }

        return list
    }

}
