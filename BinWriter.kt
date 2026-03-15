class BinWriter {

    fun write(frames:List<Frame>):ByteArray{

        val buffer = ByteBuffer.allocate(frames.size*12+8)

        buffer.order(ByteOrder.LITTLE_ENDIAN)

        buffer.putInt(0x42494C45)
        buffer.putInt(1)

        for(f in frames){

            buffer.putInt(f.spriteId)
            buffer.putInt(f.layer)
            buffer.putInt(f.duration)

        }

        return buffer.array()
    }

}
