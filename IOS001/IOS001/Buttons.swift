//
//  Buttons.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 26/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared

// Need to add real application Navigation into the app right now just images.

struct HomeButton: View {
    
    var body: some View {
            HStack(alignment:.bottom){
                Spacer()
                Spacer()
                NavigationLink(destination: HomeScreen()){
                Image(.homeButton).resizable().frame(width: 60, height: 60)
            }.frame(width: 150, height:150)
            }
       
    }
}

struct NextButton <Destination: View>: View {
    var destination: () -> Destination
    var body: some View {
            HStack{
                Spacer()
                Spacer()
                NavigationLink( destination: self.destination ){
                    Image(.NEXT_BUTTON).resizable().frame(width: 60, height: 60)
                }
            }
    }
}

struct BackButton<Destination: View>: View {
    var destination: () -> Destination
    var body: some View {
            HStack{
                NavigationLink(destination: self.destination){
                    Image(.NEXT_BUTTON).resizable().frame(width: 60, height: 60).rotationEffect(Angle(degrees: 180))
                }
                Spacer()
                Spacer()
            }
    }
}

struct HomeButtonPreview: PreviewProvider {
    static var previews: some View {
        BackButton(destination: {HomeScreen()})
    }
}

func call(givenNumber:String){
    let app = UIApplication.shared

    guard let number = URL(string: "tel://" + String(givenNumber)), app.canOpenURL(number) else {
        return
    }
    app.open(number)
}
