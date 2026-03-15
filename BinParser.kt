class BinParser {

    fun parse(bytes:ByteArray):List<Frame>{

        val buffer = ByteBuffer.wrap(bytes)
        val frames = mutableListOf<Frame>()

        buffer.order(ByteOrder.LITTLE_ENDIAN)

        val magic = buffer.int
        val version = buffer.int

        while(buffer.remaining() > 12){

            val sprite = buffer.int
            val layer = buffer.int
            val time = buffer.int

            frames.add(Frame(sprite,layer,time))

        }

        return frames
    }

}
