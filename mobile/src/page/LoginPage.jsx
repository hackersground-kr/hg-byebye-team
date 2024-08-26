import React from 'react';
import styled from 'styled-components';

// 스타일 정의
const Container = styled.div`
    display: flex;
    flex-direction: column;
    width: 100%;
    height: 100vh;
    padding: 20px;
    box-sizing: border-box;
    background-color: #FFFFFF;
    font-family: 'Pretendard', sans-serif;
`;

const LoginInfoBox = styled.div`
    flex: 9;
    margin-top: 90px;
`;

const Heading = styled.h1`
    font-size: 27px;
    font-weight: 700; /* Pretendard Bold */
    color: #000000;
`;

const Input = styled.input`
    width: 100%;
    height: 55px;
    margin-top: ${(props) => props.mt || '0'};
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

const LoginButton = styled.button`
    width: 100%;
    height: 50px;
    margin: 10px 15px 0;
    background-color: #000000; /* bac_button color */
    color: #FFFFFF;
    font-size: 16px;
    font-weight: 700; /* Pretendard Bold */
    border: none;
    border-radius: 4px;
    cursor: pointer;
`;

const SignupContainer = styled.div`
    display: flex;
    justify-content: center;
    margin-top: 10px;
`;

const SignupText = styled.span`
    font-family: 'Pretendard Medium', sans-serif;
    font-size: 12px;
    color: #000000;
`;

const SignupLink = styled.span`
    font-family: 'Pretendard SemiBold', sans-serif;
    font-size: 12px;
    color: #000000;
    margin-left: 5px;
    cursor: pointer;
`;

const LoginPage = () => {
    return (
        <Container>
            <LoginInfoBox>
                <Heading>회원 정보를 입력해주세요.</Heading>
                <Input
                    id="loginEmailEdit"
                    type="email"
                    placeholder="아이디를 입력해주세요"
                />
                <Input
                    id="loginPasswordEdit"
                    type="password"
                    placeholder="비밀번호"
                    mt="20px"
                />
            </LoginInfoBox>
            <LoginButton id="loginButton">로그인</LoginButton>
            <SignupContainer>
                <SignupText>계정이 없으신가요?</SignupText>
                <SignupLink id="loginToJoin">회원가입</SignupLink>
            </SignupContainer>
        </Container>
    );
};

export default LoginPage;
