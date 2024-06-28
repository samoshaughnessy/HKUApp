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


struct Topbar: View {
    var title: String
//    var dropDown: [String]
    
    var body: some View {
        HStack{
            NavigationLink(destination: BurgerMenu()){
                Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
        }.frame(width: 50)
            Spacer()
            Text(title).lineLimit(3).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
            Spacer()
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

