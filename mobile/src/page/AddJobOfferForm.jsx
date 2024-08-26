import React, { useState } from 'react';
import styled from 'styled-components';

// Styled Components
const Container = styled.div`
    display: flex;
    flex-direction: column;
    width: 100%;
    height: 100vh;
    padding: 0 20px;
    box-sizing: border-box;
    background-color: #ffffff; // Background color of the LinearLayout
`;

const FormContainer = styled.div`
    flex: 9;
    margin-top: 90px;
`;

const Title = styled.h1`
    font-size: 27px;
    color: #000000;
    font-family: 'Pretendard-Bold';
    margin-bottom: 30px;
`;

const Input = styled.input`
    width: 100%;
    height: 55px;
    padding-left: 10px;
    margin-top: ${props => props.marginTop || '20px'};
    font-family: 'Pretendard-Medium';
    border: 1px solid #BCBCBC;
    border-radius: 4px;
    box-sizing: border-box;

    &::placeholder {
        color: #BCBCBC;
    }
`;

const Button = styled.button`
    width: 100%;
    height: 50px;
    margin: 10px 15px;
    background-color: #007BFF; // Background color for the button
    color: #ffffff;
    border: none;
    border-radius: 4px;
    font-size: 16px;
    font-family: 'Pretendard-Bold';
    cursor: pointer;
    
    &:hover {
        background-color: #0056b3; // Darker shade for hover effect
    }
`;

const JobPostingForm = () => {
    // State hooks for form data
    const [title, setTitle] = useState('');
    const [name, setName] = useState('');
    const [phone, setPhone] = useState('');
    const [otherInfo, setOtherInfo] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        // Handle form submission
        console.log('Form submitted:', { title, name, phone, otherInfo });
    };

    return (
        <Container>
            <FormContainer>
                <Title>구인 글 추가하기</Title>
                <form onSubmit={handleSubmit}>
                    <Input
                        type="text"
                        placeholder="제목을 입력해주세요"
                        value={title}
                        onChange={(e) => setTitle(e.target.value)}
                    />
                    <Input
                        type="text"
                        placeholder="이름을 입력해주세요"
                        value={name}
                        onChange={(e) => setName(e.target.value)}
                        marginTop="30px"
                    />
                    <Input
                        type="text"
                        placeholder="전화번호를 입력해주세요."
                        value={phone}
                        onChange={(e) => setPhone(e.target.value)}
                        marginTop="20px"
                    />
                    <Input
                        type="text"
                        placeholder="기타 정보를 입력해주세요"
                        value={otherInfo}
                        onChange={(e) => setOtherInfo(e.target.value)}
                        marginTop="20px"
                    />
                    <Button type="submit">추가하기</Button>
                </form>
            </FormContainer>
        </Container>
    );
};

export default JobPostingForm;