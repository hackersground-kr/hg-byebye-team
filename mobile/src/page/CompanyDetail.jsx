import React, { useEffect, useState } from 'react';
import styled from 'styled-components';
import Background from '../component/common/Background';
import axios from 'axios';

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
    const [companyList, setCompanyList] = useState([]);

    useEffect(() => {
        axios.get("https://ca-hackerground-hgfyajoqog7sk.jollyforest-cf4e8105.koreacentral.azurecontainerapps.io/business")
            .then(res => {
                setCompanyList(res.data.data);
            })
            .catch(err => {
                console.log(err);
            })
    }, [])

    return (
        <Background>
            <Header>Chapter2에서 태어난 기업</Header>
                
                {companyList.map((company, index) => {
                    return (
                        <Card>
                        <Logo src="naver.png" alt="Company Logo"/>
                        <TextContainer>
                            <CompanyName>{company.name}</CompanyName>
                            <CompanyDescription>{company.shortDescription}</CompanyDescription>
                        </TextContainer>
                        <ArrowIcon src="arrow.png" alt="Arrow"/>
                        </Card>
                    )
                })}
            
        </Background>
    );
}

export default CompanyDetail;
