import { Background, NavigationBar } from "./component/NavigationBar";

import MyPage from "./page/MyProfile";

import { BrowserRouter, Route, Routes } from "react-router-dom";
import MainPage from "./page/MainPage";
import LoginPage from "./page/LoginPage";
import JoinPage from "./page/JoinPage";
import CompanyPage from "./page/CompanyPage";
import EducationPage from "./page/EducationPage";
import Meeting from "./page/Meeting";
// import MobileCompanyInfo from "./page/MobileCompanyInfo"

function App() {
  return (
    <BrowserRouter>
    <Background>

      <Routes>
        <Route path="/" element={<MainPage/>}/>
        <Route path="/mypage" element={<MyPage/>}/>
        <Route path="/login" element={<LoginPage/>}/>
        <Route path="/join" element={<JoinPage/>}/>
        <Route path="/company" element={<CompanyPage/>}/>
        <Route path="/education" element={<EducationPage/>}/>
        <Route path="/meet" element={<Meeting/>}/>
        {/*<Route path="/mobile/company/info" element={<MobileCompanyInfo/>}/>*/}
      </Routes>
      
    </Background>
    </BrowserRouter>
  );
}

export default App;
