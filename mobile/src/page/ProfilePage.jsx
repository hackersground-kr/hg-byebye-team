import React, { useEffect, useState } from 'react';
import styled from 'styled-components';
import Background from '../component/common/Background';
import axios from 'axios';
import { getCookie } from '../utils/react-cookies';
import { useNavigate } from 'react-router-dom';

// Styles
const Container = styled.div`
    display: flex;
    flex-direction: column;
    width: 100%;
    height: 100vh;
    padding: 0;
    margin: 0;
    font-family: 'Pretendard', sans-serif;
`;

const Title = styled.h1`
    font-size: 30px;
    font-weight: 600; /* Pretendard Semibold */
    color: #000000;
    margin: 50px 0 0 15px;
`;

const ProfileContainer = styled.div`
    display: flex;
    flex-direction: row;
    align-items: center;
    margin-top: 20px;
`;

const ProfileImage = styled.img`
    width: 80px;
    height: 80px;
    margin-left: 15px;
`;

const ProfileInfo = styled.div`
    display: flex;
    flex-direction: column;
    margin-left: 20px;
`;

const UserName = styled.h2`
    font-size: 25px;
    font-weight: 500; /* Pretendard Medium */
    color: #000000;
    margin: 0;
`;

const UserPhone = styled.p`
    font-size: 20px;
    font-weight: 500; /* Pretendard Medium */
    color: #000000;
    margin: 5px 0 0 0;
`;

const SectionTitle = styled.h3`
    font-size: 20px;
    font-weight: 500; /* Pretendard Medium */
    color: #000000;
    margin: 50px 0 0 20px;
`;

const Card = styled.div`
    display: flex;
    flex-direction: row;
    align-items: center;
    background: #E0E0E0; /* Grey background */
    margin: 15px 15px 0 15px;
    padding: 15px;
    border-radius: 8px;
`;


const CardDescription = styled.p`
    font-size: 16px;
    font-weight: 500; /* Pretendard Medium */
    color: #000000;
    margin: 0;
`;

const SettingsSection = styled.div`
    background: #F2F2F2;
    margin-top: 50px;
    padding: 0;
`;

const SettingsItem = styled.div`
    display: flex;
    flex-direction: row;
    align-items: center;
    background: #FFFFFF;
    padding: 13px 20px;
`;

const SettingsText = styled.p`
    font-size: 18px;
    font-weight: 500; /* Pretendard Medium */
    color: ${props => props.color || '#000000'};
    margin: 0;
`;

const ArrowIcon = styled.img`
    width: 30px;
    height: 30px;
`;

const Separator = styled.div`
    flex: 1;
`;

// Component
const ProfilePage = () => {
    const navigate = useNavigate();

    const [name, setName] = useState('서승훈');
    const [phoneNum, setPhoneNum] = useState('010-1234-1234');

    useEffect(() => {
        console.log(`${getCookie('accessToken')}`)
        axios.get(
            "https://ca-hackerground-hgfyajoqog7sk.jollyforest-cf4e8105.koreacentral.azurecontainerapps.io/member/myInfo",
            {
                "headers": {
                    "Authorization": `Bearer ${getCookie('accessToken')}`
                }
            }
        )
            .then(res => {
                console.log("zzz")
                setName(res.data.data.name)
                setPhoneNum(res.data.data.phoneNum)
            })
            .catch(err => {
                console.log(err);
                navigate("/login");
            })
    })

    return (
        <Background>
            <Title>프로필</Title>
            <ProfileContainer>
                <ProfileImage src="profile.png" alt="Profile" />
                <ProfileInfo>
                    <UserName>{name}</UserName>
                    <UserPhone>{phoneNum}</UserPhone>
                </ProfileInfo>
            </ProfileContainer>
            <SettingsSection>
                <SettingsItem>
                    <SettingsText>개인정보처리방침</SettingsText>
                    <Separator />
                    <ArrowIcon src="arrow.png" alt="Arrow" />
                </SettingsItem>
                <SettingsItem marginTop="20px">
                    <SettingsText color="#FF0000">로그아웃</SettingsText>
                    <Separator />
                    <ArrowIcon src="arrow.png" alt="Arrow" />
                </SettingsItem>
                <SettingsItem marginTop="20px">
                    <SettingsText color="#FF0000">회원탈퇴</SettingsText>
                    <Separator />
                    <ArrowIcon src="arrow.png" alt="Arrow" />
                </SettingsItem>
            </SettingsSection>
        </Background>
    );
};

export default ProfilePage;