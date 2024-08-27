import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom'; // Link 임포트
import styled from 'styled-components';
import Background from '../component/common/Background';
import axios from 'axios';

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

const ViewAll = styled(Link)`
    font-size: 15px;
    color: #B0B0B0;
    margin-left: auto;
    margin-right: 10px;
    cursor: pointer; /* 클릭 가능한 스타일 추가 */
    text-decoration: none;
`;

const AddButton = styled(Link)`
    font-size: 24px;
    color: #B0B0B0;
    cursor: pointer;
    text-decoration: none;
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
    const [jobOfferList, setJobOfferList] = useState([]);

    useEffect(() => {
        axios.get("https://ca-hackerground-hgfyajoqog7sk.jollyforest-cf4e8105.koreacentral.azurecontainerapps.io/gooin")
            .then(res => {
                setJobOfferList(res.data.data);
            })
            .catch(err => {
                console.log(err);
            })
    }, [])

    return (
        <Background>
            <Image src="https://www.kised.or.kr/upload/popupzone/a1/169942776583800.png" alt="Promotion" />
            <SectionHeader>
                <SectionTitle>구인</SectionTitle>
                <ViewAll to="/show-all-job-offer">전체보기</ViewAll>
                <AddButton to="/add-job-offer">+</AddButton>
            </SectionHeader>
            {jobOfferList.map((jobOffer, index) => {
                if (index >= 1) {
                    return null;
                }
                return (
                    <JobItem key={index}>
                        <JobTitle>{jobOffer.title}</JobTitle>
                        <JobAuthor>{jobOffer.userName}</JobAuthor>
                    </JobItem>
                );
            })}
            <Divider />
        </Background>
    );
};

export default Chapter2;
