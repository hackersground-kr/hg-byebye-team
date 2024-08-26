import React from 'react';
import styled from 'styled-components';

// Styles
const Container = styled.div`
    display: flex;
    flex-direction: column;
    width: 100%;
    height: 100vh;
    padding: 15px;
    box-sizing: border-box;
    background-color: #FFFFFF;
    font-family: 'Pretendard', sans-serif;
`;

const Title = styled.h1`
    font-size: 30px;
    font-weight: 600; /* Pretendard Semibold */
    color: #000000;
    margin: 0;
`;

const Image = styled.img`
    width: 100%;
    height: 200px;
    object-fit: cover;
    margin-top: 15px;
`;

const JobTitle = styled.h2`
    font-size: 25px;
    font-weight: 600; /* Pretendard Semibold */
    color: #000000;
    margin-top: 20px;
    margin-bottom: 0;
`;

const Name = styled.p`
    font-size: 20px;
    font-weight: 500; /* Pretendard Medium */
    color: #000000;
    margin-top: 15px;
    margin-bottom: 0;
`;

const PhoneNumber = styled.p`
    font-size: 20px;
    font-weight: 500; /* Pretendard Medium */
    color: #000000;
    margin-top: 10px;
    margin-bottom: 0;
`;

const Description = styled.p`
    font-size: 15px;
    color: #6C6C6C;
    font-weight: 500; /* Pretendard Medium */
    margin-top: 20px;
    margin-bottom: 0;
    white-space: pre-wrap; /* Preserve line breaks in the text */
`;

const Button = styled.button`
    width: calc(100% - 30px); /* 15px left and right margin */
    height: 50px;
    margin: 30px 15px 0;
    background-color: #007BFF; /* Button color */
    color: #FFFFFF;
    font-size: 16px;
    font-weight: 600; /* Pretendard Semibold */
    border: none;
    border-radius: 5px;
    cursor: pointer;
    &:hover {
        background-color: #0056b3; /* Darker shade of blue */
    }
`;

// Component
const JobSearchDetails = ({ imageSrc, jobTitle, name, phoneNumber, description }) => {
    return (
        <Container>
            <Title>구직</Title>
            <Image src={imageSrc} alt="Job Search" />
            <JobTitle>{jobTitle}</JobTitle>
            <Name>{name}</Name>
            <PhoneNumber>{phoneNumber}</PhoneNumber>
            <Description>{description}</Description>
            <Button>연락하기</Button>
        </Container>
    );
};

export default JobSearchDetails;