import React from 'react'
import { Button } from "./button"
import { Header } from 'src/component/NavigationBar'

const NavItem = ({ text }) => (
  <span className="text-gray-600 text-sm cursor-pointer hover:text-gray-800">{text}</span>
)

const Section = () => (
  <div className="flex flex-col items-center">
    <div className="w-20 h-20 bg-[#19ce60] rounded-full flex items-center justify-center text-white text-4xl font-bold mb-4">
      N
    </div>
    <p className="text-center mb-4 text-sm">마늘 관련 창업 아이디어 회의</p>
    <Button className="bg-blue-500 hover:bg-blue-600 text-white font-bold py-2 px-4 rounded text-sm">
      회의 참가
    </Button>
  </div>
)

export default function Meeting() {
  return (
    <div className="max-w-4xl mx-auto p-4">
      <Header></Header>

      <main className="flex flex-col sm:flex-row justify-between items-center space-y-8 sm:space-y-0 sm:space-x-4">
        <Section />
        <Section />
        <Section />
      </main>
    </div>
  )
}