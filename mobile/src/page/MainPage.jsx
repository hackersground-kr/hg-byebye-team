import React from 'react';
import styled from 'styled-components';

// 스타일 정의
const Container = styled.div`
    display: flex;
    flex-direction: column;
    width: 100%;
    height: 100vh;
    background-color: #FFFFFF;
    font-family: 'Pretendard', sans-serif;
    box-sizing: border-box;
    padding: 15px;
`;

const Header = styled.h1`
    font-size: 25px;
    font-weight: 600; /* Pretendard Semibold */
    color: #000000;
    margin: 15px 0;
`;

const Image = styled.img`
    width: 100%;
    height: 180px;
    object-fit: cover;
`;

const SectionHeader = styled.div`
    display: flex;
    align-items: center;
    margin: 30px 0 15px 0;
`;

const SectionTitle = styled.h2`
    font-size: 24px;
    font-weight: 600; /* Pretendard Semibold */
    color: #000000;
    margin: 0 15px 0 0;
`;

const ViewAll = styled.span`
    font-size: 15px;
    color: #B0B0B0;
    margin-left: auto;
    margin-right: 15px;
`;

const Divider = styled.div`
    width: 100%;
    height: 1px;
    background-color: #DDDDDD; /* bottom_line color */
    margin: 15px 0;
`;

const JobItem = styled.div`
    display: flex;
    align-items: center;
    margin: 15px 0;
`;

const JobTitle = styled.div`
    font-size: 17px;
    font-weight: 500; /* Pretendard Medium */
    color: #000000;
    margin-right: auto;
`;

const JobAuthor = styled.div`
    font-size: 13px;
    color: #000000;
`;

const Chapter2 = () => {
    return (
        <Container>
            <Header>Chapter2</Header>
            <Image src="{홍보 사진 URL}" alt="Promotion" />
            <SectionHeader>
                <SectionTitle>구인</SectionTitle>
                <ViewAll>전체보기</ViewAll>
            </SectionHeader>
            <JobItem>
                <JobTitle>[구인] 마늘 관련 창업할 사람 구함</JobTitle>
                <JobAuthor>서승훈</JobAuthor>
            </JobItem>
            <Divider />
            <JobItem>
                <JobTitle>[구인] 마늘 관련 창업할 사람 구함</JobTitle>
                <JobAuthor>서승훈</JobAuthor>
            </JobItem>
            <Divider />
            <SectionHeader>
                <SectionTitle>구직</SectionTitle>
                <ViewAll>전체보기</ViewAll>
            </SectionHeader>
            <JobItem>
                <JobTitle>[구인] 마늘만 30년 깠습니다</JobTitle>
                <JobAuthor>서승훈</JobAuthor>
            </JobItem>
            <Divider />
            <JobItem>
                <JobTitle>[구인] 마늘만 30년 깠습니다</JobTitle>
                <JobAuthor>서승훈</JobAuthor>
            </JobItem>
        </Container>
    );
};

export default Chapter2;
