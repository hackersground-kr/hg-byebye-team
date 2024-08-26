import React, { useState } from 'react';
import styled from 'styled-components';
import Background from '../component/common/Background';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import { setCookie } from '../utils/react-cookies';

const LoginInfoBox = styled.div`
    margin: 90px auto;
    text-align: center;
`;

const Heading = styled.h1`
    font-size: 27px;
    font-weight: 700; /* Pretendard Bold */
    color: #000000;
`;

const Input = styled.input`
    width: 100%;
    height: 55px;
    font-family: 'Pretendard Medium', sans-serif;
    font-size: 16px;
    border: 1px solid #BCBCBC;
    border-radius: 4px;
    box-sizing: border-box;
    margin-bottom: 10px;

    &::placeholder {
        color: #BCBCBC;
    }
`;

const LoginButton = styled.button`
    width: 100%;
    height: 50px;
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
    const navigate = useNavigate();

    const login = () => {
        var userId = document.getElementById("userId").value;
        var password = document.getElementById("password").value;

        const request = {
            id: userId,
            password: password
        }

        axios.post("https://ca-hackerground-hgfyajoqog7sk.jollyforest-cf4e8105.koreacentral.azurecontainerapps.io/member/login", request)
            .then(res => {
                setCookie('accessToken', res.data.data.accessToken.substring(7), {
                    path: "/",
                    secure: "/"
                })

                navigate("/");
            })
            .catch(err => {
                console.log(err);
            })
    }

    return (
        <Background>
            <LoginInfoBox>
                <Heading>회원 정보를 입력해주세요.</Heading>
                <Input
                    id="userId"
                    type="text"
                    placeholder="아이디를 입력해주세요"
                />
                <Input
                    id="password"
                    type="password"
                    placeholder="비밀번호를 입력해주세요"
                    mt="20px"
                />
                <LoginButton id="loginButton" onClick={login}>로그인</LoginButton>
            </LoginInfoBox>
            <SignupContainer>
                <SignupText>계정이 없으신가요?</SignupText>
                <SignupLink id="loginToJoin" onClick={() => {navigate("/signup")}}>회원가입</SignupLink>
            </SignupContainer>
        </Background>
    );
};

export default LoginPage;
