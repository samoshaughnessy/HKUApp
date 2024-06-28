//
//  Lists.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 26/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared

// fix the veritcal alignment 

struct BulletList: View {
    let items: [String]
    var body: some View {
        ForEach(items, id:\.self){item in
            HStack(){
                Text(" •\t").font(Font.system(size: 20)).frame(width: 40, height: 20)
                Text(item).font(Font.system(size: 20)).multilineTextAlignment(.leading).lineLimit(3)
            }.frame(width: .infinity)
                .frame(alignment: /*@START_MENU_TOKEN@*/.center/*@END_MENU_TOKEN@*/)
        }
    }
}

struct IndentedBulletList: View {
    let items: [String]
    let indentedItem: String
    var body: some View {
        ForEach(items, id:\.self){item in
            HStack(){
                Text(" •\t").font(Font.system(size: 20)).frame(width: 40, height: 20)
                Text(item).font(Font.system(size: 20)).multilineTextAlignment(.leading).lineLimit(3)
            }.frame(width: .infinity)
                .frame(alignment: /*@START_MENU_TOKEN@*/.center/*@END_MENU_TOKEN@*/)
        }
            if !indentedItem.isEmpty{
                HStack(){
                    Text("\t  。\t").font(Font.system(size: 20)).frame(width: 60, height: 20)
                    Text(indentedItem).font(Font.system(size: 20)).multilineTextAlignment(.leading).lineLimit(3)
                }.frame(width: .infinity)
                    .frame(alignment: /*@START_MENU_TOKEN@*/.center/*@END_MENU_TOKEN@*/)
            }
    }
}

struct CustomBullet : Identifiable {
    var data: String
    var decoration: String
    var id: Int
}

struct CustomBulletList : View {
    let items: [CustomBullet]
    var body: some View {
        ForEach(items, id:\.data){item in
            HStack(){
                Text(item.decoration).font(Font.system(size: 20)).frame(width: 40, height: 20)
                Text(item.data).font(Font.system(size: 20)).multilineTextAlignment(.leading).lineLimit(3)
            }.frame(width: .infinity)
                .frame(alignment: /*@START_MENU_TOKEN@*/.center/*@END_MENU_TOKEN@*/)
        }
    }
    
}

struct OrderedList: View {
    let items: [String]
    var body: some View {
        ForEach(Array(items.enumerated()), id:\.element){ (index: Int, item :String) in
            HStack (){
                Text(String(index + 1 )+".").font(Font.system(size: 20)).frame(width: 40, height: 20)
                Text(item).font(Font.system(size: 20)).multilineTextAlignment(.leading).lineLimit(3)
            }.frame(width: .infinity)
                .frame(alignment: /*@START_MENU_TOKEN@*/.center/*@END_MENU_TOKEN@*/)

        }
    }
}

struct HalfwayHomeList: View {
    let items: [String]
    var body : some View {
        VStack(alignment:.leading){
            HStack(){
                Text(" •\t地址:").font(Font.system(size: 20)).frame(width: 100)
                Text(items[0]).frame(minHeight: 60).font(Font.system(size: 20))
            }
            HStack(){
                Text(" •\t電話:").font(Font.system(size: 20)).frame(width: 100)
                Text(items[1]).font(Font.system(size: 20))
            }
            HStack(){
                Text(" •\t傳真:").font(Font.system(size: 20)).frame(width: 100)
                Text(items[2]).font(Font.system(size: 20))
            }
            HStack(){
                Text(" •\t電郵:").font(Font.system(size: 20)).frame(width: 100)
                Text(items[3]).font(Font.system(size: 20))
            }
        }
        }
    }

