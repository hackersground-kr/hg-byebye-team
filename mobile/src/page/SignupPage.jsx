import React, { useState } from 'react';
import styled from 'styled-components';
import Background from '../component/common/Background';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

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

const FormContainer = styled.div`
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
    margin-bottom: 20px;
    font-family: 'Pretendard Medium', sans-serif;
    font-size: 16px;
    border: 1px solid #BCBCBC;
    border-radius: 4px;
    box-sizing: border-box;

    &::placeholder {
        color: #BCBCBC;
    }
`;

const SignupButton = styled.button`
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

const SignupPage = () => {
    const navigate = useNavigate();

    const join = () => {
        var userId = document.getElementById('userId').value
        var password = document.getElementById('password').value
        var username = document.getElementById('username').value
        var phoneNumber = document.getElementById('phoneNumber').value
        const request = {
            id: userId,
            password: password,
            name: username,
            phoneNum: phoneNumber
        }

        console.log(request)

        axios.post("https://ca-hackerground-hgfyajoqog7sk.jollyforest-cf4e8105.koreacentral.azurecontainerapps.io/member/register", request)
            .then(res => {
                navigate("/");
            })
            .catch(err => {
                console.log(err);
            })
    }

    return (
        <Background>
            <FormContainer>
                <Heading>회원가입해주세요.</Heading>
                <Input
                    id="userId"
                    type="email"
                    placeholder="아이디를 입력해주세요"
                />
                <Input
                    id="password"
                    type="password"
                    placeholder="비밀번호를 입력해주세요."
                    mt="20px"
                />
                <Input
                    id="username"
                    type="text"
                    placeholder="이름을 입력해주세요."
                    mt="20px"
                />
                <Input
                    id="phoneNumber"
                    type="text"
                    placeholder="전화번호를 입력해주세요."
                    mt="20px"
                />
            </FormContainer>
            <SignupButton id="signupButton" onClick={join}>회원가입</SignupButton>
        </Background>
    );
};

export default SignupPage;
