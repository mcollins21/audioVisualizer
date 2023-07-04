package audiovisualization

import java.io.File

fun main() {
    val audioFile = File("src/main/breakmysoul.wav") // Replace with the path to your audio file
    val audioInput = AudioInput(audioFile)

    val audioAnalyzer = AudioAnalyzer(audioInput)
    val audioData = audioAnalyzer.analyze()

    val visualizer = AudioVisualizer()
    visualizer.displayWaveform(audioData.waveform)
    visualizer.displaySpectrogram(audioData.spectrogram)

    // Add any additional visualization methods or interactivity here

    // Start the visualization loop
    visualizer.start()
}
