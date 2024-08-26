import React from 'react';
import styled from 'styled-components';

// 스타일 정의
const Container = styled.div`
    display: flex;
    flex-direction: column;
    width: 100%;
    height: 100vh;
    padding: 15px;
    box-sizing: border-box;
    font-family: 'Pretendard', sans-serif;
    color: #000;
`;

const Header = styled.div`
    font-size: 30px;
    font-weight: 600; /* Pretendard Semibold */
    margin-bottom: 15px;
`;

const Image = styled.div`
    width: 100%;
    height: 200px;
    background-color: #ddd; /* 이미지가 로드되지 않을 경우의 기본 색상 */
    background-size: cover;
    background-position: center;
    margin-bottom: 20px;
    background-image: url(${props => props.src});
`;

const JobTitle = styled.div`
    font-size: 25px;
    font-weight: 600; /* Pretendard Semibold */
    margin-top: 20px;
    margin-bottom: 15px;
`;

const Name = styled.div`
    font-size: 20px;
    font-weight: 500; /* Pretendard Medium */
    margin-top: 15px;
`;

const PhoneNumber = styled.div`
    font-size: 20px;
    font-weight: 500; /* Pretendard Medium */
    margin-top: 10px;
`;

const Description = styled.div`
    font-size: 15px;
    color: #6C6C6C;
    margin-top: 20px;
    margin-left: 15px;
    margin-right: 15px;
`;

const Button = styled.button`
    width: calc(100% - 30px);
    height: 50px;
    margin: 20px 15px 30px;
    background-color: #007bff; /* 버튼 배경 색상 */
    color: #fff;
    border: none;
    border-radius: 5px;
    font-size: 16px;
    font-weight: 600; /* Pretendard Semibold */
    cursor: pointer;
    outline: none;
    box-shadow: none; /* 기본 버튼 스타일 제거 */
`;

const JobApplication = () => {
    return (
        <Container>
            <Header>구인</Header>
            <Image src="{이미지}" />
            <JobTitle>구인 제목</JobTitle>
            <Name>이름</Name>
            <PhoneNumber>전화번호</PhoneNumber>
            <Description>
                대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글.
            </Description>
            <Button>신청하기</Button>
        </Container>
    );
}

export default JobApplication;
