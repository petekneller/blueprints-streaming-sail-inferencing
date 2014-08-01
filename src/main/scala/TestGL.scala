import javax.media.opengl.{GLCanvas, GLCapabilities}

object TestGL extends App {

  def getCaps: GLCapabilities = {
    val caps: GLCapabilities = new GLCapabilities();
    try {
      caps.setAlphaBits(8)		//if NOT opaque
      caps.setDoubleBuffered(true)
      caps.setHardwareAccelerated(true)

      //FSAA
      val antialisaing = 4
      if (antialisaing == 0) {
        caps.setSampleBuffers(false)
      } else if (antialisaing == 2) {
        caps.setSampleBuffers(true)
        caps.setNumSamples(2)
      } else if (antialisaing == 4) {
        caps.setSampleBuffers(true) // this fails under my vm setup
        caps.setNumSamples(4)
      } else if (antialisaing == 8) {
        caps.setSampleBuffers(true)
        caps.setNumSamples(8)
      } else if (antialisaing == 16) {
        caps.setSampleBuffers(true)
        caps.setNumSamples(16)
      }
    } catch {
      case ex: javax.media.opengl.GLException => ex.printStackTrace
    }

    caps
  }

  println(System.getProperty("java.library.path"))
  System.setProperty("java.library.path", System.getProperty("java.library.path") + ":~/src/github.blueprints-streaming-sail-inferencing/lib")
  println(System.getProperty("java.library.path"))

  val canvas: GLCanvas = new GLCanvas(getCaps)

}
