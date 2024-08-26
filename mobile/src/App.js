import React from 'react'; 
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import CompanyDetail from "./page/CompanyDetail";
import ShowAllJobSearch from './page/ShowAllJobSearch';
import ShowAllJobOffer from "./page/ShowAllJobOffer";
import Chapter2 from "./page/Chapter2";
import BottomNav from './page/BottomNav'; // 추가된 BottomNav 컴포넌트
import EducationScreen from './page/EducationScreen';
import ProfilePage from './page/ProfilePage';

function App() {
  return (
    <Router>
      <div>
        <Routes>
          <Route path="/" element={<Chapter2 />} />
          <Route path="/education" element={<EducationScreen />} /> {/* 실제 EducationScreen 컴포넌트를 사용하세요 */}
          <Route path="/company-detail" element={<CompanyDetail />} />
          <Route path="/profile" element={<ProfilePage />} /> {/* 실제 ProfilePage 컴포넌트를 사용하세요 */}
          <Route path="/job-posting-form" element={<ShowAllJobSearch />} />
          <Route path="/show-all-job-offer" element={<ShowAllJobOffer />} />
        </Routes>
        <BottomNav />
      </div>
    </Router>
  );
}

export default App;
