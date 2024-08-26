import React from 'react'; 
import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';
import CompanyDetail from "./page/CompanyDetail";
import ShowAllJobOffer from "./page/ShowAllJobOffer";
import Chapter2 from "./page/Chapter2";
import { Box, IconButton } from '@mui/material';
import EducationScreen from './page/EducationScreen';
import ProfilePage from './page/ProfilePage';
import Footer from './component/common/Footer';
import styled from 'styled-components';
import Header from './component/common/Header';
import LoginPage from './page/LoginPage';
import SignupPage from './page/SignupPage';
import JobOfferDetailPage from './page/JobOfferDetailPage';
import AddJobOfferForm from './page/AddJobOfferForm';

function App() {
  const Background = styled.div`
    width: 100%;
    height: 100%;
    border: 1px solid #E0E0E0;
  `;

  return (
    <Router>
    <Background>
      <Header></Header>
      <Routes>
        <Route path="/" element={<Chapter2 />} />
        <Route path="/education" element={<EducationScreen />} /> 
        <Route path="/company-detail" element={<CompanyDetail />} />
        <Route path="/profile" element={<ProfilePage />} />

        <Route path="/show-all-job-offer" element={<ShowAllJobOffer />} />
        <Route path="/job-offer-detail/:id" element={<JobOfferDetailPage/>}/>
        <Route path="/add-job-offer" element={<AddJobOfferForm/>}/>

        <Route path="/login" element={<LoginPage/>}/>
        <Route path="/signup" element={<SignupPage/>}/>
      </Routes>
      <Footer></Footer>
    </Background>
    </Router>
  );
}

export default App;
