import React from 'react';
import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';
import CompanyDetail from "./page/CompanyDetail";
import CompanyInfo from "./page/CompanyInfo";
import JobApplication from "./page/JobApplication";
import LoginPage from "./page/LoginPage";
import MainPage from "./page/Chapter2";
import ShowAllJobOffer from "./page/ShowAllJobOffer";
import SignupPage from "./page/SignupPage";
import Chapter2 from "./page/Chapter2";
import ShowAllJobSearch from './page/ShowAllJobSearch';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Chapter2 />} />
        <Route path="/job-posting-form" element={<ShowAllJobSearch />} />
        <Route path="/show-all-job-offer" element={<ShowAllJobOffer />} />
        {/* 추가적인 라우트 설정 */}
      </Routes>
    </Router>
  );
}

export default App;
