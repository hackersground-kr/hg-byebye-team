import React from 'react'; 
import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';
import CompanyDetail from "./page/CompanyDetail";
import ShowAllJobSearch from './page/ShowAllJobSearch';
import ShowAllJobOffer from "./page/ShowAllJobOffer";
import Chapter2 from "./page/Chapter2";
import HomeIcon from '@mui/icons-material/Home'; 
import SchoolIcon from '@mui/icons-material/School';
import BusinessIcon from '@mui/icons-material/Business';
import PersonIcon from '@mui/icons-material/Person';
import { Box, IconButton } from '@mui/material';
import EducationScreen from './page/EducationScreen';
import ProfilePage from './page/ProfilePage';

function App() {
  return (
    <Router>
      <Box sx={{ minHeight: '100vh', paddingBottom: '60px' }}>  {/* 바텀바 높이만큼 패딩 추가 */}
        <Routes>
          <Route path="/" element={<Chapter2 />} />
          <Route path="/education" element={<EducationScreen />} /> 
          <Route path="/company-detail" element={<CompanyDetail />} />
          <Route path="/profile" element={<ProfilePage />} />
          <Route path="/job-posting-form" element={<ShowAllJobSearch />} />
          <Route path="/show-all-job-offer" element={<ShowAllJobOffer />} />
        </Routes>
      </Box>
      <Box 
        sx={{ 
          width: '100%', 
          position: 'fixed', 
          bottom: 0,
          backgroundColor: '#fff', 
          boxShadow: '0 -2px 5px rgba(0,0,0,0.1)' 
        }}
      >
        <Box sx={{ display: 'flex', justifyContent: 'space-around', padding: '10px 0' }}>
          <Link to="/" style={{ textDecoration: 'none', color: '#000' }}>
            <IconButton sx={{ padding: 0 }}>
              <HomeIcon sx={{ fontSize: 30 }} />
            </IconButton>
          </Link>
          <Link to="/education" style={{ textDecoration: 'none', color: '#000' }}>
            <IconButton sx={{ padding: 0 }}>
              <SchoolIcon sx={{ fontSize: 30 }} />
            </IconButton>
          </Link>
          <Link to="/company-detail" style={{ textDecoration: 'none', color: '#000' }}>
            <IconButton sx={{ padding: 0 }}>
              <BusinessIcon sx={{ fontSize: 30 }} />
            </IconButton>
          </Link>
          <Link to="/profile" style={{ textDecoration: 'none', color: '#000' }}>
            <IconButton sx={{ padding: 0 }}>
              <PersonIcon sx={{ fontSize: 30 }} />
            </IconButton>
          </Link>
        </Box>
      </Box>
    </Router>
  );
}

export default App;
