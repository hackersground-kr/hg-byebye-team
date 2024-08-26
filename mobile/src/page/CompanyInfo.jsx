import React from 'react';
import styled from 'styled-components';
import Background from '../component/common/Background';

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
    background-color: white;
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

const CompanyName = styled.div`
    font-size: 25px;
    font-weight: 600; /* Pretendard Semibold */
    margin-bottom: 15px;
`;

const OwnerName = styled.div`
    font-size: 20px;
    font-weight: 500; /* Pretendard Medium */
    margin-bottom: 10px;
`;

const PhoneNumber = styled.div`
    font-size: 20px;
    font-weight: 500; /* Pretendard Medium */
    margin-bottom: 10px;
`;

const Description = styled.div`
    font-size: 15px;
    color: #6C6C6C;
    margin-bottom: 20px;
`;

const Button = styled.button`
    width: calc(100% - 30px);
    height: 50px;
    margin: 0 15px 30px;
    background-color: #007bff; /* 버튼 배경 색상 */
    color: #fff;
    border: none;
    border-radius: 5px;
    font-size: 16px;
    font-weight: 600; /* Pretendard Semibold */
    cursor: pointer;
`;

const CompanyInfo = () => {
    return (
        <Background>
            <Header>기업</Header>
            <Image src="{이미지}" />
            <CompanyName>기업 이름</CompanyName>
            <OwnerName>사장 이름</OwnerName>
            <PhoneNumber>전화번호</PhoneNumber>
            <Description>
                대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글. 대충 기업을 소개하는 글.
            </Description>
            <Button>다음으로</Button>
        </Background>
    );
}

export default CompanyInfo;
