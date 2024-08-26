import React from 'react';
import { Link } from 'react-router-dom'; // Link 임포트
import styled from 'styled-components';
import Background from '../component/common/Background';

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
    cursor: pointer; /* 클릭 가능한 스타일 추가 */
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
        <Background>
            <Image src="https://www.kised.or.kr/upload/popupzone/a1/169942776583800.png" alt="Promotion" />
            <SectionHeader>
                <SectionTitle>구인</SectionTitle>
                <Link to="/show-all-job-offer">
                    <ViewAll>전체보기</ViewAll>
                </Link>
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
        </Background>
    );
};

export default Chapter2;
