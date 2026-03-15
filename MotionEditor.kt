class MotionEditor {

    fun addFrame(motion:Motion,frame:Frame){

        motion.frames.add(frame)

    }

    fun removeFrame(motion:Motion,index:Int){

        motion.frames.removeAt(index)

    }

}
