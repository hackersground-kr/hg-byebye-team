import React from 'react';
import styled from 'styled-components';

// Styles
const Container = styled.div`
    display: flex;
    flex-direction: column;
    width: 100%;
    height: 100vh;
    background-color: #FFFFFF;
    padding: 15px;
    box-sizing: border-box;
    font-family: 'Pretendard', sans-serif;
`;

const Header = styled.div`
    display: flex;
    align-items: center;
    margin-bottom: 15px;
`;

const HeaderText = styled.h1`
    font-size: 30px;
    font-weight: 600; /* Pretendard Semibold */
    color: #000000;
`;

const SearchInput = styled.input`
    width: calc(100% - 30px); /* 15px left and right margin */
    height: 55px;
    margin: 10px 15px 0;
    padding: 0 10px;
    font-family: 'Pretendard Medium', sans-serif;
    font-size: 16px;
    border: 1px solid #BCBCBC;
    border-radius: 4px;
    box-sizing: border-box;
`;

const JobItem = styled.div`
    display: flex;
    align-items: center;
    margin-top: 15px;
    padding: 10px 0;
    border-bottom: 1px solid #BCBCBC;
`;

const JobText = styled.p`
    font-size: 17px;
    font-weight: 500; /* Pretendard Medium */
    color: #000000;
    margin: 0;
`;

const JobAuthor = styled.p`
    font-size: 13px;
    color: #000000;
    margin: 0;
    margin-left: auto;
    margin-right: 15px;
`;

const ShowAllJobSearch = () => {
    const jobOffers = [
        "[구인] 마늘 관련 창업할 사람 구함",
        "[구인] 마늘 관련 창업할 사람 구함",
        "[구인] 마늘만 30년 깠습니다",
        "[구인] 마늘 관련 창업할 사람 구함",
        "[구인] 마늘 관련 창업할 사람 구함",
        "[구인] 마늘만 30년 깠습니다",
        "[구인] 마늘 관련 창업할 사람 구함",
        "[구인] 마늘만 30년 깠습니다",
        "[구인] 마늘 관련 창업할 사람 구함",
        "[구인] 마늘 관련 창업할 사람 구함"
    ];

    return (
        <Container>
            <Header>
                <HeaderText>구직</HeaderText>
            </Header>
            <SearchInput placeholder="검색" />
            {jobOffers.map((offer, index) => (
                <JobItem key={index}>
                    <JobText>{offer}</JobText>
                    <JobAuthor>서승훈</JobAuthor>
                </JobItem>
            ))}
        </Container>
    );
};

export default ShowAllJobSearch;
