package model

class Camera{
    private var isOn: Boolean = false
    private var resolution: Int = 640
    private var zoom: String = "10x"
    private var isFlashOn: Boolean = false


    fun setResolution(resolution: Int){
        this.resolution = resolution
    }

    fun getResolution(): Int{
        return this.resolution
    }

    fun setZoom(zoom: String){
        this.zoom = zoom
    }

    fun getZoom(): String{
        return this.zoom
    }

    fun turnOnFlash(){
        this.isFlashOn = true
    }

    fun turnOffFlash(){
        this.isFlashOn = false
    }

    fun getFlashStatus(): String{
        return if(isFlashOn) "El flash está encendido" else "El Flash está apagado"
    }

    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun getCameraStatus(): String{
        return if (isOn) "La cámara está encendida" else "La cámara está apagada"
    }
}