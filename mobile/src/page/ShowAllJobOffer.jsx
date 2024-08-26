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
    margin-bottom: 10px;
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

    &::placeholder {
        color: #BCBCBC;
    }
`;

const JobListing = styled.div`
    display: flex;
    align-items: center;
    margin-top: ${(props) => props.mt || '0'};
`;

const JobDescription = styled.div`
    flex: 1;
    margin-right: 15px;
`;

const JobText = styled.p`
    font-size: 17px;
    font-family: 'Pretendard Medium', sans-serif;
    color: #000000;
`;

const JobAuthor = styled.p`
    font-size: 13px;
    color: #000000;
    margin-top: 5px;
`;

const Divider = styled.div`
    width: 100%;
    height: 1px;
    background-color: #BCBCBC;
    margin: 15px 0;
`;

const ShowAllJobOffer = () => {
    const jobOffers = [
        { description: '[구인] 마늘 관련 창업할 사람 구함', author: '서승훈' },
        { description: '[구인] 마늘 관련 창업할 사람 구함', author: '서승훈' },
        { description: '[구인] 마늘만 30년 깠습니다', author: '서승훈' },
        { description: '[구인] 마늘 관련 창업할 사람 구함', author: '서승훈' },
        { description: '[구인] 마늘만 30년 깠습니다', author: '서승훈' },
        { description: '[구인] 마늘 관련 창업할 사람 구함', author: '서승훈' },
        { description: '[구인] 마늘만 30년 깠습니다', author: '서승훈' },
        { description: '[구인] 마늘 관련 창업할 사람 구함', author: '서승훈' }
    ];

    return (
        <Container>
            <Header>
                <HeaderText>구인</HeaderText>
            </Header>
            <SearchInput
                id="searchInput"
                type="text"
                placeholder="검색"
            />
            {jobOffers.map((offer, index) => (
                <React.Fragment key={index}>
                    <JobListing mt={index === 0 ? '25px' : '15px'}>
                        <JobDescription>
                            <JobText>{offer.description}</JobText>
                        </JobDescription>
                        <JobAuthor>{offer.author}</JobAuthor>
                    </JobListing>
                    <Divider />
                </React.Fragment>
            ))}
        </Container>
    );
};

export default ShowAllJobOffer;
