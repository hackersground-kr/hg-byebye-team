import React from 'react'
import { ChevronRight } from "lucide-react"
import { Header } from 'src/component/NavigationBar'

const ListItem = ({ text }) => (
  <div className="flex items-center justify-between p-4 bg-white rounded-lg shadow-sm mb-2">
    <div className="flex items-center">
      <div className="w-10 h-10 bg-[#19ce60] rounded-full flex items-center justify-center text-white font-bold text-xl mr-3">
        N
      </div>
      <div>
        <p className="font-semibold">네이버</p>
        <p className="text-sm text-gray-500">{text}</p>
      </div>
    </div>
    <ChevronRight className="text-gray-400" />
  </div>
)

export default function Chapter2List() {
  return (
    <div className="max-w-4xl mx-auto p-4">
        <Header></Header>
      <h1 className="text-2xl font-bold mb-4">Chapter2에서 태어난 기업</h1>
      <div className="space-y-2">
        {[...Array(8)].map((_, i) => (
          <ListItem key={i} text="일이 힘들어도 계속는 기업 ㄷ" />
        ))}
      </div>
    </div>
  )
}