//
//  Topbar.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 28/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared

struct DestinationItem <Destination: View>: Identifiable {
        var text: String
        var destination: () -> Destination
        var id: UUID
}

//struct NextButton <Destination: View>: View {
//    var destination: () -> Destination
//    var body: some View {
//
//                NavigationLink( destination: self.destination ){
//                    Image(.NEXT_BUTTON).resizable().frame(width: 60, height: 60)
//                }
//    }
//}


struct Topbar: View {
    var title: String
//    var dropDownItems: [DestinationItem]
    
@State    var tapped = false
    
    var body: some View {
        HStack{
            NavigationLink(destination: BurgerMenu()){
                Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
        }.frame(width: 50)
            Spacer()
            Text(title).lineLimit(3).font(Font.system(size: 35)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).onTapGesture {
                tapped = true
            }
            Spacer()
        }
        if tapped {
            VStack{
                LinkingButton(destination: { A_aScreen()}, text: "什麼是有條件釋放？")
                LinkingButton(destination: { A_bScreen()}, text: "病人在有條件下獲釋放出院的命令摹本")
                LinkingButton(destination: { A_cScreen()}, text: "什麼是“條件”？")
            }.onTapGesture {
                tapped = false
            }
        }
        
    }
}

struct TopbarDropdown: View {
    var body: some View {
        VStack{
            
        }
    }
}

struct TopbarPreview: PreviewProvider {
    static var previews: some View {
        Topbar(
            title:
                "Start here" //dropDown: ["Go there1", "go there 2"]
        )
    }
}

