/**
 * v0 by Vercel.
 * @see https://v0.dev/t/UHJhuUXXKHw
 * Documentation: https://v0.dev/docs#integrating-generated-code-into-your-nextjs-app
 */

import { Card, CardHeader, CardTitle, CardContent } from "./card"

import { Header } from "src/component/NavigationBar"

export default function MainPage() {
  return (
    <div className="max-w-4xl mx-auto p-4">
      <Header></Header>
      <main className="flex flex-col items-center p-4">
        <img
          src="/banner.jpeg"
          alt="Main Banner"
          className="my-8 w-full max-w-4xl"
          width="800"
          height="300"
          style={{ aspectRatio: "800/300", objectFit: "cover" }}
        />
        <div className="grid grid-cols-2 gap-4 w-full max-w-4xl">
          <Card className="w-full">
            <CardHeader>
              <CardTitle>구인</CardTitle>
              <a href="#" className="ml-auto text-muted-foreground">
                전체보기
              </a>
            </CardHeader>
            <CardContent>
              <ul className="space-y-2">
                <li className="flex justify-between">
                  <span>마늘 관련 창업할 사람 구함</span>
                  <span>서승훈</span>
                </li>
                <li className="flex justify-between">
                  <span>마늘 관련 창업할 사람 구함</span>
                  <span>서승훈</span>
                </li>
                <li className="flex justify-between">
                  <span>마늘 관련 창업할 사람 구함</span>
                  <span>서승훈</span>
                </li>
              </ul>
            </CardContent>
          </Card>
          <Card className="w-full">
            <CardHeader>
              <CardTitle>구직</CardTitle>
              <a href="#" className="ml-auto text-muted-foreground">
                전체보기
              </a>
            </CardHeader>
            <CardContent>
              <ul className="space-y-2">
                <li className="flex justify-between">
                  <span>마늘 관련 창업할 사람 구함</span>
                  <span>서승훈</span>
                </li>
                <li className="flex justify-between">
                  <span>마늘 관련 창업할 사람 구함</span>
                  <span>서승훈</span>
                </li>
                <li className="flex justify-between">
                  <span>마늘 관련 창업할 사람 구함</span>
                  <span>서승훈</span>
                </li>
              </ul>
            </CardContent>
          </Card>
        </div>
      </main>
    </div>
  )
}