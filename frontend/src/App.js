import { Background, NavigationBar } from "./component/NavigationBar";

import MyPage from "./page/MyProfile";

import { BrowserRouter, Route, Routes } from "react-router-dom";
import MainPage from "./page/MainPage";
import LoginPage from "./page/LoginPage";
import JoinPage from "./page/JoinPage";
import CompanyPage from "./page/CompanyPage";

function App() {
  return (
    <BrowserRouter>
    <Background>
      <NavigationBar/>

      <Routes>
        <Route path="/" element={<MainPage/>}/>
        <Route path="/mypage" element={<MyPage/>}/>
        <Route path="/login" element={<LoginPage/>}/>
        <Route path="/join" element={<JoinPage/>}/>
        <Route path="/company" element={<CompanyPage/>}/>
      </Routes>
      
    </Background>
    </BrowserRouter>
  );
}

export default App;
