import React from 'react';
import { Link } from 'react-router-dom';
import { Box, IconButton } from '@mui/material';
import HomeIcon from '@mui/icons-material/Home';
import SchoolIcon from '@mui/icons-material/School';
import BusinessIcon from '@mui/icons-material/Business';
import PersonIcon from '@mui/icons-material/Person';

const BottomNav = () => {
  return (
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
  );
};

export default BottomNav;
