import UIKit
import SwiftUI
import shared
import MapKit


struct ComposeView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        let _ = print(MapKt.test())
        
      
        
        return Main_iosKt.MainViewController()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct MapView: UIViewRepresentable {
    let coordinate: CLLocationCoordinate2D

    func makeUIView(context: Context) -> MKMapView {
        let map = MKMapView()
        let region = MKCoordinateRegion(
            center: coordinate,
            latitudinalMeters: 1000,
            longitudinalMeters: 1000)
        map.setRegion(region, animated: true)
        return map
    }

    func updateUIView(_ view: MKMapView, context: Context) {
        // Update the view as necessary
    }
}


struct ContentView: View {
    var body: some View {
        MapView(coordinate: CLLocationCoordinate2D(latitude: 1.35, longitude: 103.87))

        //ComposeView()
                .ignoresSafeArea(.all, edges: .bottom) // Compose has own keyboard handler
    }
}



