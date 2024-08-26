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
    background-color: #F6F6F6;
    font-family: 'Pretendard', sans-serif;
    color: #000;
`;

const Header = styled.div`
    font-size: 25px;
    font-weight: 600; /* Pretendard Semibold */
    margin-top: 15px;
    margin-bottom: 15px;
`;

const Card = styled.div`
    display: flex;
    align-items: center;
    background-color: #FFFFFF; /* 버튼 배경 색상: 흰색 */
    margin-top: 30px;
    margin-left: 15px;
    margin-right: 15px;
    padding: 15px;
    border-radius: 12px; /* 모서리 둥글게 */
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); /* 그림자 효과 */
`;

const Logo = styled.img`
    width: 60px;
    height: 60px;
    margin-right: 15px;
`;

const TextContainer = styled.div`
    flex: 1;
`;

const CompanyName = styled.div`
    font-size: 22px;
    font-weight: 600; /* Pretendard Semibold */
    margin-bottom: 5px;
`;

const CompanyDescription = styled.div`
    font-size: 16px;
    font-weight: 500; /* Pretendard Medium */
`;

const ArrowIcon = styled.img`
    width: 30px;
    height: 30px;
`;

const CompanyDetail = () => {
    return (
        <Container>
            <Header>Chapter2에서 태어난 기업</Header>
            <Card>
                <Logo src="{네이버 로고 이미지}" alt="Company Logo"/>
                <TextContainer>
                    <CompanyName>네이버</CompanyName>
                    <CompanyDescription>말이 필요없는 개쩌는 기업 ㄷ</CompanyDescription>
                </TextContainer>
                <ArrowIcon src="{화살표 이미지}" alt="Arrow"/>
            </Card>
        </Container>
    );
}

export default CompanyDetail;
