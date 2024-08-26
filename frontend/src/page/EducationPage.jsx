import React from 'react'
import { Header } from 'src/component/NavigationBar'

const NavItem = ({ text }) => (
  <span className="text-gray-600 text-sm">{text}</span>
)

const Card = ({ title }) => (
  <div className="bg-white rounded-lg shadow-md overflow-hidden">
    <img 
      src="/placeholder.svg?height=150&width=300" 
      alt="Placeholder" 
      className="w-full h-32 object-cover"
    />
    <div className="p-4">
      <h3 className="text-blue-600 font-bold mb-2">창업의 모든 것,</h3>
      <h3 className="text-blue-600 font-bold mb-2">K-STARTUP</h3>
      <p className="text-gray-700">{title}</p>
    </div>
  </div>
)

export default function EducationPage() {
  return (
    <div className="max-w-4xl mx-auto p-4">
      <Header></Header>

      <main>
        <div className="mb-6">
          <img 
            src="/placeholder.svg?height=300&width=800" 
            alt="Main image" 
            className="w-full h-64 object-cover rounded-lg"
          />
        </div>

        <div className="grid grid-cols-3 gap-4">
          <Card title="창업의 기초" />
          <Card title="창업의 중급" />
          <Card title="창업의 고급" />
        </div>
      </main>
    </div>
  )
}