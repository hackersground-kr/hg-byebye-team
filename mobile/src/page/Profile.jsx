import React from 'react';
import styled from 'styled-components';

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

const CardImage = styled.img`
    width: 60px;
    height: 60px;
    margin-right: 15px;
`;

const CardContent = styled.div`
    display: flex;
    flex-direction: column;
`;

const CardTitle = styled.h4`
    font-size: 22px;
    font-weight: 600; /* Pretendard Semibold */
    color: #000000;
    margin: 0;
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
    margin: ${props => props.marginTop || '20px'} 15px 0 15px;
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
    return (
        <Container>
            <Title>프로필</Title>
            <ProfileContainer>
                <ProfileImage src="/path/to/logo.png" alt="Profile" />
                <ProfileInfo>
                    <UserName>{'{사용자 이름}'}</UserName>
                    <UserPhone>010-1234-1234</UserPhone>
                </ProfileInfo>
            </ProfileContainer>
            <SectionTitle>나의 창업</SectionTitle>
            <Card>
                <CardImage src="/path/to/naver.png" alt="Naver" />
                <CardContent>
                    <CardTitle>네이버</CardTitle>
                    <CardDescription>말이 필요없는 개쩌는 기업 ㄷ</CardDescription>
                </CardContent>
                <Separator />
                <ArrowIcon src="/path/to/arrow.png" alt="Arrow" />
            </Card>
            <SettingsSection>
                <SettingsItem>
                    <SettingsText>개인정보처리방침</SettingsText>
                    <Separator />
                    <ArrowIcon src="/path/to/arrow.png" alt="Arrow" />
                </SettingsItem>
                <SettingsItem marginTop="20px">
                    <SettingsText color="#FF0000">로그아웃</SettingsText>
                    <Separator />
                    <ArrowIcon src="/path/to/arrow.png" alt="Arrow" />
                </SettingsItem>
                <SettingsItem marginTop="20px">
                    <SettingsText color="#FF0000">회원탈퇴</SettingsText>
                    <Separator />
                    <ArrowIcon src="/path/to/arrow.png" alt="Arrow" />
                </SettingsItem>
            </SettingsSection>
        </Container>
    );
};

export default ProfilePage;